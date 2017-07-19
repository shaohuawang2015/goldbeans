package com.limo.goldbeans.facade.request;

/**
 * Created by shaohua.wsh on 2017/7/18.
 */
public class CategoryCreateRequest extends BaseRequest{
    private static final long serialVersionUID = 4716359213029270516L;

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
