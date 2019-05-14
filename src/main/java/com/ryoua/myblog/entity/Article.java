package com.ryoua.myblog.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-07
 */
@Entity(name = "tb_ryoua_article")
public class Article implements Serializable {
    //主键
    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    //文章标题
    @Column(name = "article_title")
    private String articleTitle;

    //文章内容
    @Column(name = "article_content")
    private String articleContent;

    //文章概要
    @Transient
    private String summary;

    //添加人
    @Column(name = "add_name")
    private String addName;

    //添加时间
    @Column(name = "create_time")
    private Date createTime;

    //最新更新时间
    @Transient
    private String formatTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    public String getAddName() {
        return addName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
    }
}
