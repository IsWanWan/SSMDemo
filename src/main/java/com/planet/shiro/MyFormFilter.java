package com.planet.shiro;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wanwan on 16/7/25.
 */
public class MyFormFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        //this.issueSuccessRedirect(request, response);
        WebUtils.getAndClearSavedRequest(request);
        WebUtils.redirectToSavedRequest(request,response,"/menu/getMenu");
        return false;
    }
//    @Override
//    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
//        if (!"XMLHttpRequest".equalsIgnoreCase(((HttpServletRequest) request)
//                .getHeader("X-Requested-With"))) {// 不是ajax请求
//            setFailureAttribute(request, e);
//            return true;
//        }
//        try {
//            response.setCharacterEncoding("UTF-8");
//            PrintWriter out = response.getWriter();
//            String message = e.getClass().getSimpleName();
//            if ("IncorrectCredentialsException".equals(message)) {
//                out.println("{\"code\":false,\"message\":\"密码错误\"}");
//            } else if ("UnknownAccountException".equals(message)) {
//                out.println("{\"code\":false,\"message\":\"账号不存在\"}");
//            } else if ("LockedAccountException".equals(message)) {
//                out.println("{\"code\":false,\"message\":\"账号被锁定\"}");
//            } else {
//                out.println("{\"code\":false,\"message\":\"未知错误\"}");
//            }
//            out.flush();
//            out.close();
//        } catch (IOException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//        return false;
//    }

}
