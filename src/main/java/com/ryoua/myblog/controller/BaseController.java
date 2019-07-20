package com.ryoua.myblog.controller;

import com.ryoua.myblog.service.ArticleService;
import com.ryoua.myblog.service.CategoryService;
import com.ryoua.myblog.service.CommentService;
import com.ryoua.myblog.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础控制器
 *
 * @Author ryoua Created on 2019-05-16
 */
public class BaseController {
    @Autowired
    SysService sysService;
    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Autowired
    CategoryService categoryService;

}
