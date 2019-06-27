package com.tz.order.dao;

import com.tz.order.domain.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Mapper
public interface GoodsInfoMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(GoodsInfo record);
    /**
     * 新增
     * @param record
     * @return
     */
    int insertSelective(GoodsInfo record);

    /**
     * 查询所有商品
     * @return
     */
    List<GoodsInfo> queryGoods();

    /**
     * 根据id修改商品信息
     * @param goodsInfo
     */
    void updateGoods(GoodsInfo goodsInfo);
}