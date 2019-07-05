package com.ryoua.myblog.service;

import com.ryoua.myblog.dto.ArticleDto;
import com.ryoua.myblog.dto.ArticleWithPictureDto;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
public interface ArticleService {
    void addArticle(ArticleDto articleDto);

    void deleteArticleById(Long id);

    void updateArticle(ArticleDto articleDto);

    void updateArticleCategory(Long articleId, Long categoryId);

    ArticleDto getArticleById(Long id);

    ArticlePicture getPictureByArticleId(Long id);

    List<ArticleWithPictureDto> listAll();

    List<ArticleWithPictureDto> listByCategoryId(Long id);

    List<ArticleWithPictureDto> listLastest();
}
