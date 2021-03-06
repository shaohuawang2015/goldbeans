package com.limo.goldbeans.facade.request;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public class UserRegisterRequest extends BaseRequest {

    private static final long serialVersionUID = 3027906762287663480L;

    private String userId;

    private String childrenName;

    private String headic;

    private int age;

    private String parentCode;

    private String laction;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getLaction() {
        return laction;
    }

    public void setLaction(String laction) {
        this.laction = laction;
    }
}
