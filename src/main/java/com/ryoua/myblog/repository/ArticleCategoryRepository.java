package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.ArticleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Repository
public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory, Long> {
    @Query(value = "SELECT * FROM tbl_article_category ORDER BY id DESC LIMIT 1", nativeQuery = true)
    ArticleCategory getNewist();
}
