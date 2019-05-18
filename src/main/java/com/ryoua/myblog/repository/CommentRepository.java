package com.ryoua.myblog.repository;

import com.ryoua.myblog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
