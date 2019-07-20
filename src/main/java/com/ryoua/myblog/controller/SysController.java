package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.SysLog;
import com.ryoua.myblog.entity.SysView;
import com.ryoua.myblog.service.SysService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class SysController extends BaseController{

    /**
     * 返回所有的系统日志记录信息
     *
     * @return
     */
    @ApiOperation("返回所有的SysLog信息")
    @GetMapping("/sys/log")
    public List<SysLog> listAllLog() {
        return sysService.listAllLog();
    }

    /**
     * 返回所有的系统浏览记录信息
     *
     * @return
     */
    @ApiOperation("返回所有的SysView信息")
    @GetMapping("/sys/view")
    public List<SysView> listAllView() {
        return sysService.listAllView();
    }
}
