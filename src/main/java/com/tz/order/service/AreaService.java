package com.tz.order.service;

import com.tz.order.domain.Area;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:43
 */
public interface AreaService {

    public Integer insert(Area area);

    /**
     * 查询
     * @return
     */
    public List<Area> queryList();

    public Integer update(Area area);
}
