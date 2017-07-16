package com.limo.goldbeans.facade.request;

/**
 * Created by shaohua.wsh on 2017/7/10.
 */
public class Wx3rdSessionRequest extends BaseRequest {
    private static final long serialVersionUID = 40695112878753477L;

    private String jsCode;

    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }
}
