package com.ryoua.myblog.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ryoua Created on 2019-05-16
 */
@RestController
@RequestMapping("/admin")
public class BackController extends BaseController {

    /* 后台登录账号密码 */
    private static String username = "wmyskxz";
    private static String password = "123456";


    @PostMapping("/login")
    public String login() throws Exception {
        return null;
    }

    @ApiOperation("增加一篇文章")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "summary", value = "文章简介", required = true, dataType = "String"),
            @ApiImplicitParam(name = "isTop", value = "文章是否置顶", required = true, dataType = "Boolean"),
            @ApiImplicitParam(name = "categoryId", value = "文章分类对应ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "文章md源码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pictureUrl", value = "文章题图url", required = true, dataType = "String")
    })
    @PostMapping("article/")
    public String addArticle() {
        return null;
    }

    @ApiOperation("删除一篇文章")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @DeleteMapping("article/{id}")
    public String deleteArticle() {
        return null;
    }

    @ApiOperation("编辑/更新一篇文章")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "summary", value = "文章简介", required = true, dataType = "String"),
            @ApiImplicitParam(name = "isTop", value = "文章是否置顶", required = true, dataType = "Boolean"),
            @ApiImplicitParam(name = "categoryId", value = "文章分类对应ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "文章md源码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pictureUrl", value = "文章题图url", required = true, dataType = "String")
    })
    @PutMapping("article/{id}")
    public String updateArticle() {
        return null;
    }

    @ApiOperation("改变文章分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "categoryId", value = "分类ID", required = true, dataType = "Long"),
    })
    @PutMapping("article/sort/{id}")
    public String changeArticleCategory() {
        return null;
    }

    @ApiOperation("更改文章题图信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "pictureUrl", value = "题图URL", required = true, dataType = "String")
    })
    @PutMapping("article/picture/{id}")
    public String updateArticlePicture() {
        return null;
    }

    @ApiOperation("增加分类信息")
    @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    @PostMapping("category")
    public String addCategoryInfo() {
        return null;
    }

    @ApiOperation("更新/编辑分类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    })
    @PutMapping("category/{id}")
    public String updateCategoryInfo() {
        return null;
    }

    @ApiOperation("删除分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @DeleteMapping("category/{id}")
    public String deleteCategoryInfo() {
        return null;
    }

    @ApiOperation("获取某一条分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @GetMapping("category/{id}")
    public void getCategoryInfo() {
    }

    @ApiOperation("删除文章评论信息")
    @ApiImplicitParam(name = "id", value = "评论ID", required = true, dataType = "Long")
    @DeleteMapping("comment/article/{id}")
    public String deleteArticleComment() {
        return null;
    }

    @ApiOperation("删除一条留言")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @DeleteMapping("comment/{id}")
    public String deleteComment() {
        return null;
    }

    @ApiOperation("回复留言/评论")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @GetMapping("comment/reply/{id}")
    public String replyComment() {
        return null;
    }

    @ApiOperation("获取某一条评论/留言")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @GetMapping("comment/{id}")
    public void getCommentById() {
    }

    @ApiOperation("获取一篇文章，内容为md源码格式")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @GetMapping("article/{id}")
    public void getArticleDtoById() {
    }
}
