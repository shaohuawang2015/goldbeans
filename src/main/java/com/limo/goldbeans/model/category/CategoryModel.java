package com.limo.goldbeans.model.category;

import com.limo.goldbeans.model.BaseModel;

/**
 * Created by shaohua.wsh on 2017/7/18.
 */
public class CategoryModel extends BaseModel {

    private String categoryId;

    private String categoryName;

    private int categoryPosition;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryPosition() {
        return categoryPosition;
    }

    public void setCategoryPosition(int categoryPosition) {
        this.categoryPosition = categoryPosition;
    }
}
