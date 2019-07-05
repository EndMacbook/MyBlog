package com.ryoua.myblog.service.Impl;

import com.ryoua.myblog.repository.SysViewRepository;
import com.ryoua.myblog.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
@Service
public class SysServiceImpl implements SysService {
    @Autowired
    private SysViewRepository sysViewRepository;

    @Override
    public void addView(SysView sysView) {
        sysViewRepository.save(sysView);
    }

    @Override
    public int getViewCount() {
        return sysViewRepository.findAll().size();
    }

    @Override
    public List<SysView> listAllView() {
        return sysViewRepository.findAll();
    }
}
