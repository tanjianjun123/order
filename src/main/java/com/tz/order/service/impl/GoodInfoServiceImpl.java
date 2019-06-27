package com.tz.order.service.impl;

import com.tz.order.dao.GoodsInfoMapper;
import com.tz.order.database.Master;
import com.tz.order.domain.GoodsInfo;
import com.tz.order.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:18
 */
@Service
public class GoodInfoServiceImpl implements GoodsInfoService {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;


    /*
    * @Cacheable将查询结果缓存到redis中，（key="#p0"）指定传入的第一个参数作为redis的key。 unless 表示条件表达式成立的话不放入缓存

　　@CachePut，指定key，将更新的结果同步到redis中

　　@CacheEvict，指定key，删除缓存数据，allEntries=true,方法调用后将立即清除缓存
    * */



    /**
     * 对数据进行处理，要想缓存数据保持一致，就是清除缓存，再添加缓存
     * 这里使用sellerId来作为key，用于修改时查找查询时存入的缓存
     *
     *  @Master是强制要求从主库修改
     */
    @Override
    @CacheEvict(value="GoodsInfoList",key="#sellerId",beforeInvocation=true)
    @Master
    public void updateGoods(GoodsInfo goodsInfo,Integer sellerId) {
        goodsInfoMapper.updateGoods(goodsInfo);
    }


    @Override
    @Cacheable(value = "GoodsInfoList", key = "#sellerId", unless = "#result eq null")
    public List<GoodsInfo> queryGoods(Integer sellerId) {
        return goodsInfoMapper.queryGoods();
    }
}
