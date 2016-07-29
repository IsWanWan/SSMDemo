package com.planet.login.controller;


import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 
 * <p>Title: LoginController</p>
 * <p>Description: 登陆和退出</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-22下午4:43:26
 * @version 1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	

	
	
	//用户登陆提交方法
	/**
	 * 
	 * <p>Title: login</p>

	 * @return
	 * @throws Exception
	 */
	
	//登陆提交地址，和applicationContext-shiro.xml中配置的loginurl一致
	@RequestMapping("/doLogin")
	public ModelAndView login(HttpServletRequest request)throws Exception{
		Map<String,Object> map = new HashMap<>();
		ModelAndView mv = new ModelAndView();
        String message="";

		//如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		//根据shiro返回的异常类路径判断，抛出指定异常信息
		if(exceptionClassName!=null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				message = "帐号不存在";

			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				message ="用户名或密码错误";
			} else if("randomCodeError".equals(exceptionClassName)) {
				message ="验证马错误";
			}else {
				message="其他错误";
			}
		}

		   mv.addObject("message",message);
           mv.setViewName("/login");

			return mv;


	}
	

	
  @RequestMapping("/refuse")
	public ModelAndView refuse(){
	  return  new ModelAndView("/refuse");
  }
}
