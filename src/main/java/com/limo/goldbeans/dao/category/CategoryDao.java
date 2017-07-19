package com.limo.goldbeans.dao.category;

import com.limo.goldbeans.model.category.CategoryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/18.
 */
@Repository
public interface CategoryDao {

    void insertCategory(CategoryModel categoryModel);

    /**
     * 查询所有category
     *
     * @return
     */
    List<CategoryModel> queryCategoryList();

}
