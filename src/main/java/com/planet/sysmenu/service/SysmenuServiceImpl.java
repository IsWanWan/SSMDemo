package com.planet.sysmenu.service;

import com.planet.sysmenu.dao.SysmenuMapper;
import com.planet.sysmenu.domain.Sysmenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
@Service
public class SysmenuServiceImpl implements  SysmenuService {

 @Autowired
 private SysmenuMapper sysmenuMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Sysmenu record) {
        return 0;
    }

    @Override
    public int insertSelective(Sysmenu record) {
        return 0;
    }

    @Override
    public Sysmenu selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Sysmenu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sysmenu record) {
        return 0;
    }

    @Override
    public List<Sysmenu> sysmenuList(long opertorId) {
        return sysmenuMapper.sysmenuList(opertorId);
    }
}
