package com.limo.goldbeans.facade.response.admin.DTO;

import com.limo.goldbeans.facade.response.BaseDTO;

public class MenuDTO extends BaseDTO{
    private static final long serialVersionUID = 7833028000213626483L;

    private String id;

    private String bpid;

    private String mpid;

    private String icon;

    private String name;

    private String route;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBpid() {
        return bpid;
    }

    public void setBpid(String bpid) {
        this.bpid = bpid;
    }

    public String getMpid() {
        return mpid;
    }

    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
