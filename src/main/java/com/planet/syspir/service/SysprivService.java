package com.planet.syspir.service;

import com.planet.syspir.domain.Syspriv;

import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
public interface SysprivService {

    int deleteByPrimaryKey(Long id);

    int insert(Syspriv record);

    int insertSelective(Syspriv record);

    Syspriv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Syspriv record);

    int updateByPrimaryKey(Syspriv record);

    /**
     *  根据用户查询他的角色
     * @param operId
     * @return
     */
    List<Syspriv> selectPrivByOperId(long operId);
}
