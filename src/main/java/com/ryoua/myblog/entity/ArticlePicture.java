package com.ryoua.myblog.entity;

import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class ArticlePicture {
    private Long id;

    private Long articleId;

    private String pictureUrl;

    private Date createBy;

    private Date modifiedBy;

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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Date getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "ArticlePicture{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", createBy=" + createBy +
                ", modifiedBy=" + modifiedBy +
                '}';
    }
}
