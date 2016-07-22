package com.planet.syspir.dao;

import com.planet.common.mybatis.MybatisMapper;
import com.planet.syspir.domain.Syspriv;

import java.util.List;
import java.util.Map;

public interface SysprivMapper  extends MybatisMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Syspriv record);

    int insertSelective(Syspriv record);

    Syspriv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Syspriv record);

    int updateByPrimaryKey(Syspriv record);

    List<Syspriv> selectPrivByOperId(long operId);
}