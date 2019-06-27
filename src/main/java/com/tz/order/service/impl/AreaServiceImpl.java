package com.tz.order.service.impl;

import com.tz.order.dao.AreaInfoMapper;
import com.tz.order.domain.Area;
import com.tz.order.domain.Line;
import com.tz.order.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:35
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Override
    public Integer insert(Area area){
        int insert = areaInfoMapper.insert(area);
        return insert;
    };

    /**
     * 查询
     * @return
     */
    @Override
    public List<Area> queryList(){
        List<Area> areas = areaInfoMapper.queryList();
        return areas;
    };

    @Override
    public Integer update(Area area){
        Integer update = areaInfoMapper.update(area);
        return update;
    };
}
