package com.tz.order.dao;

import com.tz.order.domain.Activiti;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-11-15 16:28
 */
@Mapper
public interface ActivitiInfoMapper {
    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Activiti record);

    /**
     * 查询所有
     * @return
     */
    List<Activiti> queryList();
    /**
     * 查询所有根据id
     * @return
     */
    Activiti queryById(Integer id);

    /**
     * 根据id
     * @param activiti
     */
    Integer update(Activiti activiti);
}