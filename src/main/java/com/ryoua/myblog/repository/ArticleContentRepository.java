package com.ryoua.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Repository
public interface ArticleContentRepository extends JpaRepository<ArticleContent, Long> {
}
