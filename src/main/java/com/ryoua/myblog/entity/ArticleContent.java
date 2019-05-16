package com.ryoua.myblog.entity;

import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class ArticleContent {
    private Long id;

    private String content;

    private Long articleId;

    private Date createBy;

    private Date modifieldBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Date getModifieldBy() {
        return modifieldBy;
    }

    public void setModifieldBy(Date modifieldBy) {
        this.modifieldBy = modifieldBy;
    }

    @Override
    public String toString() {
        return "ArticleContent{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", articleId=" + articleId +
                ", createBy=" + createBy +
                ", modifieldBy=" + modifieldBy +
                '}';
    }
}
