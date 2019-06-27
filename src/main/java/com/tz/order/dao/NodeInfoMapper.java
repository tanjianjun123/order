package com.tz.order.dao;

import com.tz.order.domain.Node;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Mapper
public interface NodeInfoMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Node record);

    /**
     * 查询所有
     * @return
     */
    List<Node> queryList();

    /**
     * 根据id
     * @param node
     */
    Integer update(Node node);
}