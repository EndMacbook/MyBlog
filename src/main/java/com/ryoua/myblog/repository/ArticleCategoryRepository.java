package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.ArticleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author ryoua Created on 2019-05-16
 */
public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory, Long> {
}
