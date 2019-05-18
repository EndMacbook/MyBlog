package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.ArticlePicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Repository
public interface ArticlePictureRepository extends JpaRepository<ArticlePicture, Long> {
}
