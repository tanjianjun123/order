package com.tz.order.dao;

import com.tz.order.domain.Line;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Mapper
public interface LineInfoMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Line record);

    /**
     * 查询所有
     * @return
     */
    List<Line> queryList();

    /**
     * 根据id
     * @param line
     */
    Integer update(Line line);
}