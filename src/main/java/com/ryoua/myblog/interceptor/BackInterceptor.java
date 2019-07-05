package com.ryoua.myblog.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 后台拦截器, 对admin开头的url拦截
 * @Author ryoua Created on 2019-05-18
 */
public class BackInterceptor implements HandlerInterceptor {

    private static final String username = "admin";
    private static final String password = "981013";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            flag = false;
        } else {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
