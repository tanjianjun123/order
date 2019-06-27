package com.tz.order.service;

import com.tz.order.domain.Node;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:43
 */
public interface NodeService {

    public Integer insert(Node node);

    /**
     * 查询
     * @return
     */
    public List<Node> queryList();

    public Integer update(Node node);
}
