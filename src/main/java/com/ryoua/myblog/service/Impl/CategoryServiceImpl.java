package com.ryoua.myblog.service.Impl;

import com.ryoua.myblog.dao.ArticleCategoryMapper;
import com.ryoua.myblog.dao.CategoryInfoMapper;
import com.ryoua.myblog.dto.ArticleCategoryDto;
import com.ryoua.myblog.entity.ArticleCategory;
import com.ryoua.myblog.entity.ArticleCategoryExample;
import com.ryoua.myblog.entity.CategoryInfo;
import com.ryoua.myblog.entity.CategoryInfoExample;
import com.ryoua.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ryoua Created on 2019-05-18
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryInfoMapper categoryInfoMapper;
    @Autowired
    ArticleCategoryMapper articleCategoryMapper;

    /**
     * 增加一条分类数据
     *
     * @param categoryInfo
     */
    @Override
    public void addCategory(CategoryInfo categoryInfo) {
        categoryInfoMapper.insertSelective(categoryInfo);
    }

    /**
     * 通过分类id删除分类信息，要对应删除两个表的内容
     *
     * @param id 分类ID
     */
    @Override
    public void deleteCategoryById(Long id) {
        // 先删除ArticleCategory表中的相关内容
        ArticleCategoryExample example = new ArticleCategoryExample();
        example.or().andCategoryIdEqualTo(id);
        List<ArticleCategory> categories = articleCategoryMapper.selectByExample(example);
        for (ArticleCategory articleCategory : categories) {
            articleCategoryMapper.deleteByPrimaryKey(articleCategory.getId());
        }
        // 再删除CategoryInfo表中的内容
        categoryInfoMapper.deleteByPrimaryKey(id);
    }


    /**
     * 更改文章对应的分类
     *
     * @param articleCategory
     */
    @Override
    public void updateArticleCategory(ArticleCategory articleCategory) {
        articleCategoryMapper.updateByPrimaryKeySelective(articleCategory);
    }

    /**
     * 更新分类信息
     *
     * @param categoryInfo
     */
    @Override
    public void updateCategory(CategoryInfo categoryInfo) {
        categoryInfoMapper.updateByPrimaryKeySelective(categoryInfo);
    }

    /**
     * 获取一条分类信息数据
     *
     * @param id
     * @return
     */
    @Override
    public CategoryInfo getOneById(Long id) {
        CategoryInfoExample example = new CategoryInfoExample();
        example.or().andIdEqualTo(id);
        List<CategoryInfo> categoryInfos = categoryInfoMapper.selectByExample(example);
        return categoryInfos.get(0);
    }

    /**
     * 列举返回所有的分类信息
     *
     * @return
     */
    @Override
    public List<CategoryInfo> listAllCategory() {
        // 无条件查询即返回所有
        CategoryInfoExample example = new CategoryInfoExample();
        return categoryInfoMapper.selectByExample(example);
    }

    /**
     * 通过文章ID获取某一篇文章对应的分类
     *
     * @param id 文章ID
     * @return
     */
    @Override
    public ArticleCategoryDto getCategoryByArticleId(Long id) {
        ArticleCategoryDto articleCategoryDto = new ArticleCategoryDto();
        // 填充tbl_article_category中的基础数据
        ArticleCategoryExample example = new ArticleCategoryExample();
        example.or().andArticleIdEqualTo(id);
        List<ArticleCategory> articleCategories = articleCategoryMapper.selectByExample(example);
        ArticleCategory articleCategory = articleCategories.get(0);
        articleCategoryDto.setArticleId(articleCategory.getArticleId());
        articleCategoryDto.setId(articleCategory.getId());
        articleCategoryDto.setCategoryId(articleCategory.getCategoryId());
        // 填充对应的分类信息
        CategoryInfo categoryInfo = getOneById(articleCategory.getCategoryId());
        articleCategoryDto.setName(categoryInfo.getName());
        articleCategoryDto.setNumber(categoryInfo.getNumber());
        return articleCategoryDto;
    }

//    /**
//     * 往ArticleCategory中填充对应的CategoryInfo信息
//     * 说明：articleCategory中必能获取到对应的分类ID，这是在删除和增加时限制的
//     *
//     * @param articleCategory
//     */
//    private void fill(ArticleCategory articleCategory) {
//        Long categoryId = articleCategory.getCategoryId();
//        articleCategory.setCategoryInfo(getOneById(categoryId));
//    }

}
