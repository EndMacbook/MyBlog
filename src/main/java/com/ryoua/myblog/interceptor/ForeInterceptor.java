package com.ryoua.myblog.interceptor;

import com.alibaba.druid.util.StringUtils;
import com.ryoua.myblog.entity.SysView;
import com.ryoua.myblog.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 记录访问信息
 *
 * @Author ryoua Created on 2019-05-18
 */
public class ForeInterceptor implements HandlerInterceptor {

    @Autowired
    SysService sysService;

    private SysView sysView = new SysView();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 访问者的IP
        String ip = request.getRemoteAddr();

        // 增加访问量
        sysView.setIp(StringUtils.isEmpty(ip) ? "0.0.0.0" : ip);
        sysService.addView(sysView);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
