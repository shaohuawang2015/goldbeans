package com.limo.goldbeans.service.category.impl;

import com.limo.goldbeans.dao.category.CategoryDao;
import com.limo.goldbeans.facade.request.CategoryCreateRequest;
import com.limo.goldbeans.model.category.CategoryModel;
import com.limo.goldbeans.model.convertor.CategoryConvertor;
import com.limo.goldbeans.service.category.CategoryManageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
@Service
public class CategoryManageServiceImpl implements CategoryManageService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createCategory(CategoryCreateRequest request) {
        categoryDao.insertCategory(CategoryConvertor.convertToCategoryModel(request));
    }

    @Override
    public List<CategoryModel> queryCategoryList() {
        return categoryDao.queryCategoryList();
    }
}
