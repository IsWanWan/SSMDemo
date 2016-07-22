package com.planet.syspir.service;

import com.planet.syspir.dao.SysprivMapper;
import com.planet.syspir.domain.Syspriv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
@Service
public class SyspriveServiceImpl implements SysprivService {

    @Autowired
    private SysprivMapper sysprivMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Syspriv record) {
        return 0;
    }

    @Override
    public int insertSelective(Syspriv record) {
        return 0;
    }

    @Override
    public Syspriv selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Syspriv record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Syspriv record) {
        return 0;
    }

    @Override
    public List<Syspriv> selectPrivByOperId(long operId) {
        return sysprivMapper.selectPrivByOperId(operId);
    }
}
