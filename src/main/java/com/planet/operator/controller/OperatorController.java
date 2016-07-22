package com.planet.operator.controller;


import com.planet.operator.domain.Operator;
import com.planet.operator.service.OperatorService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by wanwan on 16/7/21.
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {


    @Autowired
    private OperatorService operatorService;



    @RequestMapping("/byUsername")
    public ModelAndView byUsername(String username){
        ModelAndView mv  = new ModelAndView();

      Operator operator =  operatorService.selectByUsername(username);
        mv.addObject("operator",operator);

        mv.setViewName("/first");


        return mv;

    }

    @RequestMapping("/list")
    @RequiresPermissions("TOperator:view")
    public ModelAndView listPageOperator(){
        ModelAndView mv = new ModelAndView();
     List<Operator> operatorList = new ArrayList<>();

     operatorList = operatorService.getList();
        mv.addObject("operatorList",operatorList);
        mv.setViewName("/opertor");
     return mv;
    }


}
