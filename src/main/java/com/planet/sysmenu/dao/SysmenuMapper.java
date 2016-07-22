package com.planet.sysmenu.dao;

import com.planet.common.mybatis.MybatisMapper;
import com.planet.sysmenu.domain.Sysmenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysmenuMapper extends MybatisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    Sysmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);

    List<Sysmenu> sysmenuList(long opertorId);
}