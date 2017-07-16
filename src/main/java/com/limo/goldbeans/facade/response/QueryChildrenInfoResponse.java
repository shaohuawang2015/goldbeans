package com.limo.goldbeans.facade.response;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class QueryChildrenInfoResponse extends BaseResponse {
    private static final long serialVersionUID = 840646381115846834L;

    private String childrenId;

    private String childrenName;

    private String headic;

    private int age;

    private int point;

    private int vip;

    private String laction;

    public String getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public String getHeadic() {
        return headic;
    }

    public void setHeadic(String headic) {
        this.headic = headic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public String getLaction() {
        return laction;
    }

    public void setLaction(String laction) {
        this.laction = laction;
    }
}
