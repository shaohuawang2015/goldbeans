package com.limo.goldbeans.model.user;

import com.limo.goldbeans.model.BaseModel;

import java.util.Date;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class WxUserModel extends BaseModel {

    private String userId;

    private String sessionId;

    private String openId;

    private String wxSessionId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWxSessionId() {
        return wxSessionId;
    }

    public void setWxSessionId(String wxSessionId) {
        this.wxSessionId = wxSessionId;
    }

}
