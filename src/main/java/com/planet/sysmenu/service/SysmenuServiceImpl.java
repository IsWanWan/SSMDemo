package com.planet.sysmenu.service;

import com.planet.sysmenu.dao.SysmenuMapper;
import com.planet.sysmenu.domain.Sysmenu;
import com.planet.sysrole.dao.SysroleMapper;
import com.planet.sysrole.dao.SysroleMenuMapper;
import com.planet.sysrole.domain.Sysrole;
import com.planet.sysrole.domain.SysroleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
@Service
public class SysmenuServiceImpl implements  SysmenuService {

 @Autowired
 private SysmenuMapper sysmenuMapper;
    @Autowired
    private SysroleMapper sysroleMapper;
    @Autowired
    private SysroleMenuMapper sysroleMenuMapper;


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
    @Transactional(readOnly = true,propagation = Propagation.REQUIRED ,rollbackFor = Exception.class)
    public List<Sysmenu> sysmenuList(long opertorId) {
        return sysmenuMapper.sysmenuList(opertorId);
    }

    /**
     * 事务测试
     *
     * @param title
     * @param type
     * @param status
     * @return
     */
    @Override
    public int test(String title, int type, int status) {

        Sysrole sysrole = new Sysrole(title,type,new Date(),status,"hahaha");

            sysroleMapper.insert(sysrole);
        System.out.println("sysrole.getId() :::" +sysrole.getId());
        SysroleMenu sysroleMenu = new SysroleMenu((long) 6,String.valueOf(19));

       int n =  sysroleMenuMapper.insert(sysroleMenu);

        return n;
    }


}
