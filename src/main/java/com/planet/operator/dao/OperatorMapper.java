package com.planet.operator.dao;


import com.planet.common.mybatis.MybatisMapper;
import com.planet.operator.domain.Operator;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorMapper extends MybatisMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Operator record);

    int insertSelective(Operator record);

    Operator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Operator record);

    int updateByPrimaryKey(Operator record);

    Operator selectByUsername(String username);
}