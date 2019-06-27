package com.tz.order.dao;

import com.tz.order.domain.SellerInfo;
/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
public interface SellerInfoMapper {

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(SellerInfo record);
    /**
     * 新增
     * @param record
     * @return
     */
    int insertSelective(SellerInfo record);
}