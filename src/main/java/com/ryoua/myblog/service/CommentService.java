package com.ryoua.myblog.service;

import com.ryoua.myblog.dto.ArticleCommentDto;
import com.ryoua.myblog.entity.Comment;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
public interface CommentService {
    void addComment(Comment comment);

    void addArticleComment(ArticleCommentDto articleCommentDto);

    void deleteCommentById(Long id);

    void deleteArticleCommentById(Long id);

    List<Comment> listAllComment();

    List<ArticleCommentDto> listAllArticleCommentById(Long id);
}
