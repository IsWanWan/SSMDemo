package com.planet.sysrole.dao;

import com.planet.sysrole.domain.Sysrole;

public interface SysroleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    Sysrole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKeyWithBLOBs(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}