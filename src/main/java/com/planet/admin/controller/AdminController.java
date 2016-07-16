package com.planet.admin.controller;

import com.planet.admin.domain.Admin;
import com.planet.admin.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanwan on 16/7/11.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    Logger logger= LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AdminService adminService;

    @RequestMapping("/get")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();

        Admin admin = adminService.selectByPrimaryKey(1);
        List adminList = new ArrayList<Admin>();

        adminList.add(new Admin(1,"DD","22"));
        adminList.add(new Admin(2,"EE","33"));
        adminList.add(new Admin(3,"FF","44"));
        adminList.add(new Admin(4,"GG","55"));
        mv.addObject("admin",admin);
        mv.addObject("adminList",adminList);
        mv.setViewName("/success");

        logger.info(" 用户查询成功 !");
        return mv;


    }
    @RequestMapping("/list")
    public Map<String,Object>  list(){
        Map<String,Object> map = new HashMap<>();
        List adminList = new ArrayList<Admin>();

        adminList.add(new Admin(1,"DD","22"));
        adminList.add(new Admin(2,"EE","33"));
        adminList.add(new Admin(3,"FF","44"));
        adminList.add(new Admin(4,"GG","55"));

        map.put("code",200);
        map.put("msg","成功");
        map.put("rows",adminList);
        return map;
    }

}
