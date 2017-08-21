package com.limo.goldbeans.facade.response.admin;

public enum EnumRoleType {

    ADMIN("admin");

    private String code;

    private EnumRoleType(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
