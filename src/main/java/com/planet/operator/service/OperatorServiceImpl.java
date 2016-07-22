package com.planet.operator.service;


import com.planet.operator.dao.OperatorMapper;
import com.planet.operator.domain.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/21.
 */
@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Operator record) {
        return 0;
    }

    @Override
    public int insertSelective(Operator record) {
        return 0;
    }

    @Override
    public Operator selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Operator record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Operator record) {
        return 0;
    }

    @Override
    public Operator selectByUsername(String username) {
        return operatorMapper.selectByUsername(username);
    }

    @Override
    public List<Operator> getList() {
        return operatorMapper.getList();
    }
}
