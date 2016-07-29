package com.planet.admin.service;

import com.planet.admin.domain.Admin;

/**
 * Created by wanwan on 16/7/11.
 */
public interface AdminService {

    public Admin selectByPrimaryKey(int id);

    public int delete(int id);
}
