package com.limo.goldbeans.service.category;

import com.limo.goldbeans.facade.request.CategoryCreateRequest;
import com.limo.goldbeans.model.category.CategoryModel;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
public interface  CategoryManageService {

    public void createCategory(CategoryCreateRequest request);

    public List<CategoryModel> queryCategoryList();
}
