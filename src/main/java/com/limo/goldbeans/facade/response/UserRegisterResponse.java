package com.limo.goldbeans.facade.response;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class UserRegisterResponse extends BaseResponse {

    private static final long serialVersionUID = 8684061830911553737L;

    private String childrenId;

    private int ponit;

    private int vip;

    public String getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
    }

    public int getPonit() {
        return ponit;
    }

    public void setPonit(int ponit) {
        this.ponit = ponit;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }
}
