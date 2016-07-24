package com.planet.sysmenu.action;

import com.planet.operator.domain.Operator;
import com.planet.sysmenu.domain.Sysmenu;
import com.planet.sysmenu.service.SysmenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanwan on 16/7/22.
 */
@Controller
@RequestMapping("/menu")
public class SysmenuAction {
    @Autowired
    private SysmenuService sysmenuService;


    /**
     *
     * @return
     */
    @RequestMapping("/first")
    public ModelAndView first(){
        return new ModelAndView("/first");
    }

    /**
     *  获得菜单
     * @return
     */
   @RequestMapping("/getMenu")
    public ModelAndView getMenu(){
       ModelAndView  mv = new ModelAndView();

       Subject subject = SecurityUtils.getSubject();

        Operator operator = (Operator) subject.getPrincipal();

       List<Sysmenu> sysmenuList = new ArrayList<>();
       sysmenuList = sysmenuService.sysmenuList(operator.getId());

        mv.addObject("sysmenuList",sysmenuList);
        mv.setViewName("/first");
       return mv;
   }

}
