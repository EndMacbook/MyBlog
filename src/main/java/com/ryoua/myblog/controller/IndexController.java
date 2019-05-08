package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import com.youbenzi.mdtool.tool.MDTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
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
        Page<Article> articles = articleService.findArticleByPageId(0, 5);
        for (Article article : articles) {
            if (article.getArticleContent().length() <= 110) {
                article.setSummary(article.getArticleContent());
            } else {
                article.setSummary(article.getArticleContent().substring(0, 110) + "...");
            }

        }

        int pageId = 2;
        model.addAttribute("pagePreId", pageId - 1);
        model.addAttribute("pageNextId", pageId);
        model.addAttribute("articles", articles);
        return "index";
    }

    @GetMapping(value = "/{pageId}")
    public String indexByPage(@PathVariable("pageId") Integer pageId, Model model) {
        Page<Article> articles = articleService.findArticleByPageId(pageId - 1, 10);
        for (Article article : articles) {
            if (article.getArticleContent().length() <= 110) {
                article.setSummary(article.getArticleContent());
            } else {
                article.setSummary(article.getArticleContent().substring(0, 110) + "...");
            }
        }
        if (pageId <= 1) {
            model.addAttribute("pagePreId", pageId);
        } else {
            model.addAttribute("pagePreId", pageId - 1);
        }
        model.addAttribute("pageNextId", pageId + 1);
        model.addAttribute("articles", articles);
        return "index";
    }
}
