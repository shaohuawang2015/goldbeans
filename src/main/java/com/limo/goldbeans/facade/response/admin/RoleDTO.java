package com.limo.goldbeans.facade.response.admin;

import com.limo.goldbeans.facade.response.BaseDTO;

public class RoleDTO extends BaseDTO {

    /** version id */
    private static final long serialVersionUID = 9157248694735987328L;

    /** 用户角色 */
    private String role;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
