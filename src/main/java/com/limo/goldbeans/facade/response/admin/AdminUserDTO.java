package com.limo.goldbeans.facade.response.admin;

import com.limo.goldbeans.facade.response.BaseDTO;

public class AdminUserDTO extends BaseDTO{

    /** version id */
    private static final long serialVersionUID = 7533436478397422512L;

    private String id;

    private String username;

    private String password;

    private RoleDTO permissions;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(RoleDTO permissions) {
        this.permissions = permissions;
    }
}
