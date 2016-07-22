package com.planet.operator.controller;


import com.planet.operator.domain.Operator;
import com.planet.operator.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanwan on 16/7/21.
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {


    @Autowired
    private OperatorService operatorService;

//    @Autowired
//    private MenuService menuService;

    @RequestMapping("/byUsername")
    public ModelAndView byUsername(String username){
        ModelAndView mv  = new ModelAndView();

      Operator operator =  operatorService.selectByUsername(username);
        mv.addObject("operator",operator);

        mv.setViewName("/first");


        return mv;

    }





}
