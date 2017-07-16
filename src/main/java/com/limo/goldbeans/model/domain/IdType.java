package com.limo.goldbeans.model.domain;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public enum IdType {

    WX_USER_TABLE("000", "wx_user table id type"),

    CHILDREN_TABLE("001", "children table id type"),

    USER_CHILDREN_RELATION_TABLE("002", "user_children_relation id type"),;

    private String type;

    private String desc;

    private IdType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
