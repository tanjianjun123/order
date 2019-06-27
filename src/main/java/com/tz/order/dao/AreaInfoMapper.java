package com.tz.order.dao;

import com.tz.order.domain.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Mapper
public interface AreaInfoMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Area record);

    /**
     * 查询所有
     * @return
     */
    List<Area> queryList();

    /**
     * 根据id
     * @param area
     */
    Integer update(Area area);
}