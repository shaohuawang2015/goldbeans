package com.limo.goldbeans.model.convertor;

import com.limo.goldbeans.facade.request.CategoryCreateRequest;
import com.limo.goldbeans.model.category.CategoryModel;
import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.utils.IdGeneratorUtil;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
public class CategoryConvertor {

    public static CategoryModel convertToCategoryModel(CategoryCreateRequest request) {

        if (request == null) {
            return null;
        }

        CategoryModel categoryModel = new CategoryModel();

        categoryModel.setCategoryId(IdGeneratorUtil.generatorIdByType(IdType.CATEGORY_TABLE));

        categoryModel.setCategoryName(request.getCategoryName());

        return categoryModel;
    }
}
