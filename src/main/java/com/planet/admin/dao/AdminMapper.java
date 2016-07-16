package com.planet.admin.dao;

import com.planet.admin.domain.Admin;
import com.planet.common.mybatis.MybatisMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper extends MybatisMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}