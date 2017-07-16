package com.limo.goldbeans.model.user;

import com.limo.goldbeans.model.BaseModel;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class UserChildrenRelationModel extends BaseModel{

    private String userChildrenRelationId;

    private String userId;

    private String childrenId;

    public String getUserChildrenRelationId() {
        return userChildrenRelationId;
    }

    public void setUserChildrenRelationId(String userChildrenRelationId) {
        this.userChildrenRelationId = userChildrenRelationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId;
    }
}
