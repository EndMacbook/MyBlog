package com.ryoua.myblog.controller;

import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Date;

import static com.ryoua.myblog.utils.TimeStampToTime.formatTime;

/**
 * @Author ryoua Created on 2019-05-07
 */
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String index(Model model) {
//        for (int i = 1; i < 50; i++) {
//            Article article = new Article();
//            article.setId(i);
//            article.setArticleTitle("这是文章: " + i);
//            article.setArticleContent("1111333344444");
//            article.setAddName("ryoua");
//            article.setCreateTime(new Timestamp(new Date().getTime()));
//            article.setUpdateTime(new Timestamp(new Date().getTime()));
//            articleService.save(article);
//        }

        Page<Article> articles = articleService.findArticleByPageId(0, 10);
        // 设置文章标题
        articles = setArticleSummary(articles);
        articles = formatTime(articles);

        // 设置分页
        model.addAttribute("showPre", "none");
        model.addAttribute("pageNextId", 2);
        model.addAttribute("articles", articles);
        return "index";
    }

    @GetMapping(value = "/{pageId}")
    public String indexByPage(@PathVariable("pageId") Integer pageId, Model model) {
        int pageSize = articleService.findArticleByPageId(1, 10).getTotalPages();
        if (pageId <= 0 || pageId > pageSize) {
            model.addAttribute("errorMsg", "你访问的页码不存在");
            return "404";
        }

        Page<Article> articles = articleService.findArticleByPageId(pageId - 1, 10);
        articles = setArticleSummary(articles);
        articles = formatTime(articles);

        if (articleService.findArticleByPageId(pageId - 1, 10).isFirst()) {
            model.addAttribute("showPre", "none");
        }
        if (articleService.findArticleByPageId(pageId - 1, 10).isLast()) {
            model.addAttribute("showNext", "none");
        }
        model.addAttribute("pagePreId", pageId - 1);
        model.addAttribute("pageNextId", pageId + 1);
        model.addAttribute("articles", articles);
        return "index";
    }

    // 设置文章标题
    public Page<Article> setArticleSummary(Page<Article> articles) {
        for (Article article : articles) {
            if (article.getArticleContent().length() <= 110) {
                article.setSummary(article.getArticleContent());
            } else {
                article.setSummary(article.getArticleContent().substring(0, 110) + "...");
            }
        }
        return articles;
    }
}
