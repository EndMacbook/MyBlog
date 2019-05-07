package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author ryoua Created on 2019-05-07
 */
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Article> articles = new ArrayList<>();
        List<Article> lists = new ArrayList<>();
        articles = articleService.getAllArticles();

//        for (int i = 0; i < articles.size(); i++) {
//            Article article = articles.get(i);
//            article.set
//        }

        model.addAttribute("articles", articles);
        return "index";
    }
}
