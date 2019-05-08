package com.ryoua.myblog.service.Impl;

import com.ryoua.myblog.dao.ArticleRepository;
import com.ryoua.myblog.entity.Article;
import com.ryoua.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-07
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.getOne(id);
    }

    @Override
    public Page<Article> findArticleByPageId(Integer page, Integer size) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "id");
        return articleRepository.findAll(pageable);
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
}
