package com.tz.order.service;

import com.tz.order.domain.GoodsInfo;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:15
 */
public interface GoodsInfoService {
    /**
     * 查询商品信息
     * @param sellerId
     * @return
     */
    public List<GoodsInfo> queryGoods(Integer sellerId);

    /**
     * 修改商品信息
     * @param goodsInfo
     * @param sellerId
     */
    public void updateGoods(GoodsInfo goodsInfo,Integer sellerId);
}
