package com.ryoua.myblog.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author ryoua Created on 2019-05-16
 */
@RestController
@RequestMapping("/api")
public class IndexController extends BaseController {

    @ApiOperation("获取所有文章")
    @GetMapping("article/list")
    public List listAllArticleInfo() {
        return null;
    }

    @ApiOperation("获取某一个分类下的所有文章")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @GetMapping("article/list/category/{id}")
    public List listArticleInfo() {
        return null;
    }

    @ApiOperation("获取最新的几篇文章")
    @GetMapping("article/list/lastest")
    public List listLastestArticle() {
        return null;
    }

    @ApiOperation("通过文章ID获取文章信息")
    @GetMapping("article/{id}")
    public void getArticleById(@PathVariable Long id) {
    }

    @ApiOperation("获取所有分类信息")
    @GetMapping("category/list")
    public List listAllCategoryInfo() {
        return null;
    }

    @ApiOperation("获取所有的留言信息")
    @GetMapping("comment/list")
    public List listAllComment() {
        return null;
    }

    @ApiOperation("获取某一篇文章的评论信息")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @GetMapping("comment/article/{id}")
    public List listMessageByArticleId(@PathVariable Long id) {
        return null;
    }

    @ApiOperation("给文章中增加一条评论信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "评论信息", required = true, dataType = "String"),
            @ApiImplicitParam(name = "email", value = "Email地址，用于回复", required = false, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户自定义的名称", required = true, dataType = "String")
    })
    @PostMapping("comment/article/{id}")
    public String addArticleComment() {
        return null;
    }

    @ApiOperation("增加一条留言")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "评论信息", required = true, dataType = "String"),
            @ApiImplicitParam(name = "email", value = "Email地址，用于回复", required = false, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户自定义的名称", required = true, dataType = "String")
    })
    @PostMapping("comment")
    public String addMessage() {
        return null;
    }
}

