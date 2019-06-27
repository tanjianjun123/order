package com.tz.order.dao;

import com.tz.order.domain.GoodsType;
/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
public interface GoodsTypeMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(GoodsType record);

    /**
     * 新增
     * @param record
     * @return
     */
    int insertSelective(GoodsType record);
}