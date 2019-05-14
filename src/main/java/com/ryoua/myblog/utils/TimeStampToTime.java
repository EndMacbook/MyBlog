package com.ryoua.myblog.utils;

import com.ryoua.myblog.entity.Article;
import org.springframework.data.domain.Page;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Author ryoua Created on 2019-05-14
 */
public class TimeStampToTime {
    public static List<Article> formatTime(List<Article> articles) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        for (Article article: articles) {
            article.setFormatTime(ft.format(article.getCreateTime()));
        }
        return articles;
    }

    public static Page<Article> formatTime(Page<Article> articles) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        for (Article article: articles) {
            article.setFormatTime(ft.format(article.getCreateTime()));
        }
        return articles;
    }
}
