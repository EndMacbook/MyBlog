package com.ryoua.myblog.service;

import com.ryoua.myblog.entity.SysLog;
import com.ryoua.myblog.entity.SysView;

import java.util.List;

/**
 * 记录日志相关
 *
 * @Author ryoua Created on 2019-05-18
 */
public interface SysService {

    void addLog(SysLog sysLog);

    void addView(SysView sysView);

    int getLogCount();

    int getViewCount();

    List<SysLog> listAllLog();

    List<SysView> listAllView();
}
