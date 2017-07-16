package com.limo.goldbeans.facade.request;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class QueryChildrenInfoRequest extends BaseRequest{
    private static final long serialVersionUID = -8398487103554759988L;

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
