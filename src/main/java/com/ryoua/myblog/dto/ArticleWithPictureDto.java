package com.ryoua.myblog.dto;

/**
 * 带图片的文章
 * @Author ryoua Created on 2019-05-18
 */
public class ArticleWithPictureDto {
    // tbl_article_info基础字段
    private Long id;                    // ArticleInfo表主键
    private String title;               // 文章标题
    private String summary;             // 文章简介
    private Boolean isTop;              // 文章是否置顶
    private Integer traffic;            // 文章阅读量

    // tbl_article_picture基础字段
    private Long articlePictureId;      // ArticlePicture主键
    private String pictureUrl;          // 文章题图URL

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public Long getArticlePictureId() {
        return articlePictureId;
    }

    public void setArticlePictureId(Long articlePictureId) {
        this.articlePictureId = articlePictureId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "ArticleWithPictureDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", isTop=" + isTop +
                ", traffic=" + traffic +
                ", articlePictureId=" + articlePictureId +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}

