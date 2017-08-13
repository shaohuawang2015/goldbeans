package com.limo.goldbeans.facade.response.admin;

import com.limo.goldbeans.facade.response.BaseResponse;

public class DataBaseResponse<T> extends BaseResponse {
    /** version id */
    private static final long serialVersionUID = 4283579056298936858L;

    /** data */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
