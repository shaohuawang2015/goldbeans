package com.limo.goldbeans.facade.request.admin;

import com.limo.goldbeans.facade.request.BaseRequest;

public class UserLoginRequest extends BaseRequest{
    /** version Id */
    private static final long serialVersionUID = -3197518461431495158L;

    private String username;

    private String password;

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
}
