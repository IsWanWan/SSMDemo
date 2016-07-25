package com.planet.shiro;


import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

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
//  @Override
//    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
//      //  this.setFailureAttribute(request, e);
//      WebUtils.getAndClearSavedRequest(request);
//      try {
//          WebUtils.redirectToSavedRequest(request,response,"/menu/getMenu");
//      } catch (IOException e1) {
//          e1.printStackTrace();
//      }
//      return true;
//    }
}
