package com.ryoua.myblog.service;

import com.ryoua.myblog.dto.ArticleCategoryDto;
import com.ryoua.myblog.entity.ArticleCategory;
import com.ryoua.myblog.entity.CategoryInfo;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
public interface CategoryService {
    void addCategory(CategoryInfo categoryInfo);

    void deleteCategoryById(Long id);

    void updateCategory(CategoryInfo categoryInfo);

    void updateArticleCategory(ArticleCategory articleCategory);

    CategoryInfo getOneById(Long id);

    List<CategoryInfo> listAllCategory();

    ArticleCategoryDto getCategoryByArticleId(Long id);
}
