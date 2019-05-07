package com.ryoua.myblog.service;

import com.ryoua.myblog.entity.Article;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-07
 */
public interface ArticleService {
    List<Article> getAllArticles();
}
