package com.limo.goldbeans.facade.response;

/**
 * Created by shaohua.wsh on 2017/7/10.
 */
public class Wx3rdSessionResponse extends  BaseResponse {
    private static final long serialVersionUID = 1394622748677203896L;

    private String  wx3rdSession;

    public String getWx3rdSession() {
        return wx3rdSession;
    }

    public void setWx3rdSession(String wx3rdSession) {
        this.wx3rdSession = wx3rdSession;
    }
}
