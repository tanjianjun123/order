package com.tz.order.service.impl;

import com.tz.order.dao.NodeInfoMapper;
import com.tz.order.domain.Activiti;
import com.tz.order.domain.Node;
import com.tz.order.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:35
 */
@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    NodeInfoMapper nodeInfoMapper;

    @Override
    public Integer insert(Node node){
        int insert = nodeInfoMapper.insert(node);
        return insert;
    };

    /**
     * 查询
     * @return
     */
    @Override
    public List<Node> queryList(){
        List<Node> nodes = nodeInfoMapper.queryList();
        return nodes;
    };

    @Override
    public Integer update(Node node){
        Integer update = nodeInfoMapper.update(node);
        return update;
    };
}
