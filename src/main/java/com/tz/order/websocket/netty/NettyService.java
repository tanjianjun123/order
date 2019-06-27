package com.tz.order.websocket.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.channel.ChannelFuture;
/**
 * @Author: tanjianjun
 * @Date: 2019/4/18 17:21
 * @Version 1.0
 */
public class NettyService {
    /**
     * 启动
     *
     * @param port 端口
     */

    private static final int OPTION_BACKLOG_VALUE = 128;
    private static final int MAX_CONTENT_LENGTH = 512 * 1024;

    public void start(int port) {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        try {
            bootstrap.group(bossGroup, workerGroup)
                    .option(ChannelOption.SO_BACKLOG, OPTION_BACKLOG_VALUE)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            ch.pipeline().addLast(
                                    new HttpRequestDecoder(),
                                    //聚合http请求
                                    new HttpObjectAggregator(MAX_CONTENT_LENGTH),
                                    new HttpResponseEncoder(),
                                    //解决大码流的问题
                                    new ChunkedWriteHandler(),
                                    new HttpHandler()
                            );
                        }
                    });
            ChannelFuture future = bootstrap.bind("0.0.0.0", port).sync();
            if (future.isSuccess()) {
                System.out.println("http server启动成功");
            } else {
                System.out.println("http server启动失败");
            }
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
