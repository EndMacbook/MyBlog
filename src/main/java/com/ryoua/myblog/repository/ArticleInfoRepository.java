package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.ArticleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author ryoua Created on 2019-05-16
 */
public interface ArticleInfoRepository extends JpaRepository<ArticleInfo, Long> {
}
