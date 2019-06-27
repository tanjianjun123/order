package com.tz.order.service;

import com.tz.order.domain.Line;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:43
 */
public interface LineService {

    public Integer insert(Line line);

    /**
     * 查询
     * @return
     */
    public List<Line> queryList();

    public Integer update(Line line);
}
