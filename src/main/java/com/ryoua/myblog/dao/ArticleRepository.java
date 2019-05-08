package com.ryoua.myblog.dao;

import com.ryoua.myblog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Page;

/**
 * @Author ryoua Created on 2019-05-07
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
