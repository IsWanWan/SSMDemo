package com.planet.sysmenu.service;

import com.planet.sysmenu.domain.Sysmenu;

import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
public interface SysmenuService {


    int deleteByPrimaryKey(Long id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    Sysmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);

    List<Sysmenu> sysmenuList(long opertorId);


    /**
     *  事务测试
     * @param title
     * @param type
     * @param status
     * @return
     */
    int test(String title,int type,int status );
}
