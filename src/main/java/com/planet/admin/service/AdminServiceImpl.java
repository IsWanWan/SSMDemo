package com.planet.admin.service;

import com.planet.admin.dao.AdminMapper;
import com.planet.admin.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wanwan on 16/7/11.
 */
@Service
public class AdminServiceImpl implements  AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin selectByPrimaryKey(int id) {
       return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
