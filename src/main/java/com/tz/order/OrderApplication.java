package com.tz.order;

import com.tz.order.websocket.netty.NettyService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author tanjianjun
 * @create 2018-11-15 16:15
 */
@SpringBootApplication
@MapperScan("com.tz.order.mapper")
public class OrderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    //实现CommandLineRunner 重写run方法 这里放了netty的启动
    @Override
    public void run(String... args) throws Exception {
        new NettyService().start(8888);
    }
}
