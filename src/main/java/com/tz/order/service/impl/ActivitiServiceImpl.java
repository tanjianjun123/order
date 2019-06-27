package com.tz.order.service.impl;

import com.tz.order.dao.ActivitiInfoMapper;
import com.tz.order.domain.Activiti;
import com.tz.order.domain.GoodsInfo;
import com.tz.order.service.ActivitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:35
 */
@Service
public class ActivitiServiceImpl implements ActivitiService{
    @Autowired
    ActivitiInfoMapper activitiInfoMapper;

    @Override
    @Cacheable(value = "activiti", key = "#id")
    public Activiti queryById(Integer id) {
        return activitiInfoMapper.queryById(id);
    }

    @Override
    @CachePut(value = "activiti", key = "#activiti.id")
    public Activiti insert(Activiti activiti){
        int insert = activitiInfoMapper.insert(activiti);
        return activiti;
    };

    /**
     * 查询
     * @return
     */
    @Override
    public List<Activiti> queryList(){
        List<Activiti> activitis = activitiInfoMapper.queryList();
        return activitis;
    };

    @Override
    public Integer update(Activiti activiti){
        Integer update = activitiInfoMapper.update(activiti);
        return update;
    };
}
