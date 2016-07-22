package com.planet.sysrole.action;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wanwan on 16/7/22.
 */
@Controller
@RequestMapping("/role")
public class SysroleAction {

    /**
     *  角色管理页
     * @return
     */
    @RequestMapping("/list")
    @RequiresPermissions("Role:view")
    public ModelAndView list(){
        return new ModelAndView("/sysrole");
    }

}
