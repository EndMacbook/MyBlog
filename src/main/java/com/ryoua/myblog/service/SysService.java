package com.ryoua.myblog.service;

import com.ryoua.myblog.entity.SysLog;
import com.ryoua.myblog.entity.SysView;

import java.util.List;

/**
 * 记录日志相关
 * @Author ryoua Created on 2019-05-18
 */
public interface SysService {

    void addView(SysView sysView);

    int getViewCount();

    List<SysView> listAllView();
}
