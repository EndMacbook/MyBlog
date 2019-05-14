package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import com.youbenzi.mdtool.tool.MDTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author ryoua Created on 2019-05-08
 */
@Controller
public class BlogController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/blog/{blogId}")
    public String getBlogById(@PathVariable("blogId") Integer id, Model model) {
        int articleSize = articleService.getAllArticles().size();
        Article article = articleService.getArticleById(id);
        article.setArticleContent(MDTool.markdown2Html(article.getArticleContent()));
        if (id == 1) {
            model.addAttribute("showPre", "none");
            model.addAttribute("nextTitle", articleService.getArticleById(id + 1).getArticleTitle());
            model.addAttribute("article", article);
            return "blog";
        }
        if (id == articleSize) {
            model.addAttribute("showNext", "none");
            model.addAttribute("preTitle", articleService.getArticleById(id - 1).getArticleTitle());
            model.addAttribute("article", article);
            return "blog";
        }
        model.addAttribute("preTitle", articleService.getArticleById(id - 1).getArticleTitle());
        model.addAttribute("nextTitle", articleService.getArticleById(id + 1).getArticleTitle());
        model.addAttribute("article", article);
        return "blog";
    }
}
