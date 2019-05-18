package com.ryoua.myblog.service.Impl;

import com.ryoua.myblog.dto.ArticleDto;
import com.ryoua.myblog.dto.ArticleWithPictureDto;
import com.ryoua.myblog.entity.*;
import com.ryoua.myblog.repository.*;
import com.ryoua.myblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleCategoryRepository articleCategoryRepository;

    @Autowired
    private CategoryInfoRepository categoryInfoRepository;

    @Autowired
    private ArticleContentRepository articleContentRepository;

    @Autowired
    private ArticleInfoRepository articleInfoRepository;

    @Autowired
    private ArticlePictureRepository articlePictureRepository;

    private static byte MAX_LASTEST_ARTICLE_COUNT = 5;

    private Long getArticleLastestId() {
       return articleCategoryRepository.getNewist().getArticleId();
    }

    /**
     * 增加一篇文章信息
     * @param articleDto 文章封装类
     */
    @Override
    public void addArticle(ArticleDto articleDto) {
        // 文章信息表
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setTitle(articleDto.getTitle());
        articleInfo.setSummary(articleDto.getSummary());
        articleInfoRepository.save(articleInfo);

        Long articleId = getArticleLastestId();

        // 文章题图信息表
        ArticlePicture articlePicture = new ArticlePicture();
        articlePicture.setPictureUrl(articleDto.getPictureUrl());
        articlePicture.setArticleId(articleId);
        articlePictureRepository.save(articlePicture);

        // 文章内容信息表
        ArticleContent articleContent = new ArticleContent();
        articleContent.setContent(articleDto.getContent());
        articleContent.setArticleId(articleId);
        articleContentRepository.save(articleContent);

        // 文章分类信息表
        ArticleCategory articleCategory = new ArticleCategory();
        articleCategory.setCategoryId(articleDto.getCategoryId());
        articleCategory.setArticleId(articleId);
        articleCategoryRepository.save(articleCategory);

        // 分类对应的文章数量+1
        CategoryInfo categoryInfo = categoryInfoRepository.getOne(articleCategory.getCategoryId());
        categoryInfo.setNumber((byte) (categoryInfo.getNumber() + 1));
        categoryInfoRepository.save(categoryInfo);
    }

    /**
     * 删除一篇文章
     * @param id
     */
    @Override
    public void deleteArticleById(Long id) {
        ArticleDto articleDto = get
    }

    @Override
    public void updateArticle(ArticleDto articleDto) {

    }

    @Override
    public void updateArticleCategory(Long articleId, Long categoryId) {

    }

    /**
     * 获取一篇文章内容
     * @param id 文章ID
     * @return 填充好数据的ArticleInfo
     */
    @Override
    public ArticleDto getArticleById(Long id) {
        ArticleDto articleDto = new ArticleDto();

        // 填充基础信息
        ArticleInfo articleInfo = articleInfoRepository.getOne(id);
        articleDto.setId(articleInfo.getId());
        articleDto.setTitle(articleInfo.getTitle());
        articleDto.setSummary(articleInfo.getSummary());
        articleDto.setTop(articleInfo.getTop());
        articleDto.setCreateBy(articleInfo.getCreateBy());

        // 文章访问量 + 1
        articleInfo.setTraffic(articleInfo.getTraffic() + 1);
        articleDto.setTraffic(articleInfo.getTraffic() + 1);
        articleInfoRepository.save(articleInfo);

        // 填充文章内容
        ArticleContent articleContent = new ArticleContent();

    }

    @Override
    public ArticlePicture getPictureByArticleId(Long id) {
        return null;
    }

    @Override
    public List<ArticleWithPictureDto> listAll() {
        return null;
    }

    @Override
    public List<ArticleWithPictureDto> listByCategoryId(Long id) {
        return null;
    }

    @Override
    public List<ArticleWithPictureDto> listLastest() {
        return null;
    }
}
