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
@Table(name = "tbl_article_content")
public class ArticleContent {
    @Id
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modifield_by")
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
