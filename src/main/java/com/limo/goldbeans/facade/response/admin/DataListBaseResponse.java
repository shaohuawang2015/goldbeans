package com.limo.goldbeans.facade.response.admin;

import com.limo.goldbeans.facade.response.BaseResponse;

import java.util.List;


public class DataListBaseResponse<T> extends BaseResponse {
    /** version id */
    private static final long serialVersionUID = 9167734496006744382L;

    /** dataList */
    private List DataList;

    public List getDataList() {
        return DataList;
    }

    public void setDataList(List dataList) {
        DataList = dataList;
    }
}
