package com.ryoua.myblog.controller;

@RestController
@RequestMapping("/admin")
public class SysController {


    @Autowired
    SysService sysService;

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
