package com.planet.sysrole.dao;

import com.planet.common.mybatis.MybatisMapper;
import com.planet.sysrole.domain.Sysrole;

public interface SysroleMapper extends MybatisMapper{
    int deleteByPrimaryKey(Long id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    Sysrole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKeyWithBLOBs(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}