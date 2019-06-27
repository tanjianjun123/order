package com.tz.order.service.impl;

import com.tz.order.dao.LineInfoMapper;
import com.tz.order.domain.Line;
import com.tz.order.domain.Node;
import com.tz.order.service.LineService;
import com.tz.order.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanjianjun
 * @create 2018-12-27 17:35
 */
@Service
public class LineServiceImpl implements LineService {
    @Autowired
    LineInfoMapper lineInfoMapper;

    @Override
    public Integer insert(Line line){
        int insert = lineInfoMapper.insert(line);
        return insert;
    };

    /**
     * 查询
     * @return
     */
    @Override
    public List<Line> queryList(){
        List<Line> lines = lineInfoMapper.queryList();
        return lines;
    };

    @Override
    public Integer update(Line line){
        Integer update = lineInfoMapper.update(line);
        return update;
    };
}
