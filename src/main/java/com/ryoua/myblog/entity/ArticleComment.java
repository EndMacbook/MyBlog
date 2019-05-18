package com.ryoua.myblog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Entity
@Table(name = "tbl_article_comment")
public class ArticleComment {
    @Id
    private Long id;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "is_effective")
    private Boolean isEffective;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Boolean getEffective() {
        return isEffective;
    }

    public void setEffective(Boolean effective) {
        isEffective = effective;
    }

    @Override
    public String toString() {
        return "ArticleComment{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", commentId=" + commentId +
                ", createBy=" + createBy +
                ", isEffective=" + isEffective +
                '}';
    }
}
