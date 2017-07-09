package com.limo.goldbeans.facade.request;

import com.limo.goldbeans.facade.response.BaseResponse;
import org.codehaus.jackson.map.Serializers;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public class UserRegisterRequest extends BaseRequest {
    private static final long serialVersionUID = 3027906762287663480L;

    private String nickName;

    private int age;

    private String parentCode;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
}
