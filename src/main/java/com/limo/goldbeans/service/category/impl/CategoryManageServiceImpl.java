package com.limo.goldbeans.service.category.impl;

import com.limo.goldbeans.dao.category.CategoryDao;
import com.limo.goldbeans.dao.category.CategoryTaskDao;
import com.limo.goldbeans.facade.request.CategoryCreateRequest;
import com.limo.goldbeans.facade.request.CategoryTaskCreateRequest;
import com.limo.goldbeans.facade.response.DTO.CategoryDTO;
import com.limo.goldbeans.model.category.CategoryModel;
import com.limo.goldbeans.model.category.CategoryTaskModel;
import com.limo.goldbeans.model.convertor.CategoryConvertor;
import com.limo.goldbeans.model.convertor.CategoryTaskConvertor;
import com.limo.goldbeans.service.category.CategoryManageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
@Service
public class CategoryManageServiceImpl implements CategoryManageService {

    @Resource
    private CategoryDao categoryDao;

    @Resource
    private CategoryTaskDao categoryTaskDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createCategory(CategoryCreateRequest request) {
        categoryDao.insertCategory(CategoryConvertor.convertToCategoryModel(request));
    }

    @Override
    public void createCategoryTask(CategoryTaskCreateRequest request) {
        categoryTaskDao.insertCategoryTask(CategoryTaskConvertor.convertToModel(request));
    }


    @Override
    public List<CategoryDTO> queryCategoryList() {
        List<CategoryModel> categoryModels = categoryDao.queryCategoryList();
        if(categoryModels == null){
            return Collections.emptyList();
        }
        List<CategoryDTO> categoryDTOs = new ArrayList<>();
        for(CategoryModel model: categoryModels) {
           CategoryDTO categoryDTO = new CategoryDTO();
           categoryDTO.setCategoryId(model.getCategoryId());
           categoryDTO.setCategoryName(model.getCategoryName());
           categoryDTO.setPosition(model.getCategoryPosition());
           categoryDTO.setTaskDTOList(CategoryTaskConvertor.convertToDTOs(categoryTaskDao.queryTasksByCategoryId(model.getCategoryId())));
           categoryDTOs.add(categoryDTO);
        }
        return categoryDTOs;
    }
}
