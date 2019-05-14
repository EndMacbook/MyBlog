package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.ryoua.myblog.utils.TimeStampToTime.formatTime;

/**
 * @Author ryoua Created on 2019-05-09
 */
@Controller
public class ArchiveController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/archive")
    public String archive(Model model) {
        List<Article> articles = articleService.getAllArticles();
        articles = formatTime(articles);
        model.addAttribute("articles", articles);
        return "archive";
    }
}
