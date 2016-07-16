package com.planet.common.filter;


import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yehao on 2016/2/18.
 */
public class AdminFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String[] notFilter = new String[]{"/admin/login", "/admin/submitLogin", "/static/.*",   "/cow/getCowlist","/req/product-req.*","/sync/token","/sync/upload","/admin/login","/favicon.ico"};
        String uri = request.getRequestURI();
        boolean doFilter = true;
        for (String str : notFilter) {
            if (uri.indexOf(str) != -1 || uri.equals("/") || uri.matches(str)) {
                doFilter = false;
                break;
            }
        }
        if (doFilter) {
            Object o = request.getSession().getAttribute("user");
            if (o == null) {
                response.sendRedirect("/admin/login");

            } else {

                filterChain.doFilter(request, response);
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }


}
