package com.tz.order.service;

import com.tz.order.domain.Activiti;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:43
 */
public interface ActivitiService{

    public Activiti insert(Activiti activiti);

    /**
     * 查询
     * @return
     */
    public List<Activiti> queryList();

    /**
     * 查询根据Id
     * @return
     */
    public Activiti queryById(Integer id);

    public Integer update(Activiti activiti);
}
