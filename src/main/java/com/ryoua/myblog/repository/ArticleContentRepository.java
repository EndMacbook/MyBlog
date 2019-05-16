package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.ArticleContent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author ryoua Created on 2019-05-16
 */
public interface ArticleContentRepository extends JpaRepository<ArticleContent, Long> {
}
