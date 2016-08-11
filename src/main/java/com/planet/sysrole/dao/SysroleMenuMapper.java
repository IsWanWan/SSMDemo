package com.planet.sysrole.dao;

import com.planet.common.mybatis.MybatisMapper;
import com.planet.sysrole.domain.SysroleMenu;

public interface SysroleMenuMapper  extends MybatisMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysroleMenu record);

    int insertSelective(SysroleMenu record);

    SysroleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysroleMenu record);

    int updateByPrimaryKeyWithBLOBs(SysroleMenu record);

    int updateByPrimaryKey(SysroleMenu record);
}