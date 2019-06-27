package com.tz.order.dao;

import com.tz.order.domain.GoodsType;
import com.tz.order.domain.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTypeMapper {
    int countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);
}