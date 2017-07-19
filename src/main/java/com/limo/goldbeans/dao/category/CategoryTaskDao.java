package com.limo.goldbeans.dao.category;

import com.limo.goldbeans.model.category.CategoryTaskModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
@Repository
public interface CategoryTaskDao {

    public void insertCategoryTask(CategoryTaskModel categoryTaskModel);

    public void queryTaskByCategoryId(@Param("categoryId") String categoryId);
}
