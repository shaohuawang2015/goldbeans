package com.limo.goldbeans.facade.response;

import com.limo.goldbeans.facade.response.DTO.CategoryDTO;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/17.
 */
public class QueryCategoryResponse extends BaseResponse {
    private static final long serialVersionUID = -3604102941393601823L;

    private List<CategoryDTO> categoryDTOList;

    public List<CategoryDTO> getCategoryDTOList() {
        return categoryDTOList;
    }

    public void setCategoryDTOList(List<CategoryDTO> categoryDTOList) {
        this.categoryDTOList = categoryDTOList;
    }
}
