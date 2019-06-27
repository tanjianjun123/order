package com.tz.order.dao;

import com.tz.order.domain.SellerInfo;
import com.tz.order.domain.SellerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerInfoMapper {
    int countByExample(SellerInfoExample example);

    int deleteByExample(SellerInfoExample example);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    List<SellerInfo> selectByExample(SellerInfoExample example);

    int updateByExampleSelective(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);

    int updateByExample(@Param("record") SellerInfo record, @Param("example") SellerInfoExample example);
}