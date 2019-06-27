package com.tz.order.controller;

import com.tz.order.domain.GoodsInfo;
import com.tz.order.service.GoodsInfoService;
import com.tz.order.util.LogUtils;
import com.tz.order.util.RedisUtil;
import com.tz.order.util.Result;
import com.tz.order.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Controller
@RequestMapping("goods")
@Api(tags="商品信息接口类")
public class GoodsInfoController {
    private final static Logger logger = LoggerFactory.getLogger(GoodsInfoController.class);

    @Autowired
    GoodsInfoService goodsInfoService;
    @Autowired
    RedisUtil redisUtil;


    /**
     * 查询所有商品
     * @return
     */
    @ApiOperation(value="查询所有商品", notes="根据商家id查询所有商品")
   /**
   * paramType="query" get请求参数不携带的时候添加此参数
    */
    @ApiImplicitParam(name = "sellerId", value = "商家id", paramType="query",required = true, dataType = "Integer")
    @RequestMapping(value="/queryGoods.action",method = RequestMethod.GET)
    @ResponseBody
    public Result<List<GoodsInfo>> queryGoods(int sellerId){
        System.out.println("------5555------");
        //一种是封装的返回对象类型，一种是原生态返回类型，比较两种的优劣
        List<GoodsInfo> goodsInfos = goodsInfoService.queryGoods(sellerId);
        /**日志还需更加详细
        *  普通logger记录logger.info("商品查询--商家id:"+sellerId);
         *  这里使用自研封装logUtils
        */
        LogUtils.info(logger,"谈健军","根据商家id查询商品","商家id:"+sellerId);
//        redisUtil.set("name",redisUtil.get("name")+"谈健军",1000L);
        return ResultUtil.success(goodsInfos);
//       return ResultUtil.success(ResultEnum.DATA_IS_NULL.getMsg());
//        return goodsInfoService.queryGoods();
    }

    /**
     * 修改商品信息
     * @param goodsInfo
     * @return
     */
    @ApiOperation(value="根据id修改商品", notes="根据id修改商品")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "商品id", paramType="query",required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "商品名称", paramType="query",required = true, dataType = "String")})
    @RequestMapping(value="/updateGoods.action",method = RequestMethod.GET)
    @ResponseBody
    public Result updateGoods(GoodsInfo goodsInfo){
        try {
            Integer sellerId=1;
            goodsInfoService.updateGoods(goodsInfo,sellerId);
            //日志还需更加详细
            logger.info("商品修改--商品id:"+goodsInfo.getId()+"修改商品名称为："+goodsInfo.getName());
            return  ResultUtil.success();
        }catch (Exception e){
            logger.error("商品修改报错--商品id:"+goodsInfo.getId()+"修改商品名称为："+goodsInfo.getName());
            return ResultUtil.error(500,"错误");
        }
    }
}
