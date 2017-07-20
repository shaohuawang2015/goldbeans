package com.limo.goldbeans.model.user;

import com.limo.goldbeans.model.BaseModel;

import java.util.Date;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
public class DoUserTaskModel extends BaseModel {

    private String doUserTaskId;

    private String userTaskId;

    private Date doTaskId;

    private int doTaskDay;

    public String getDoUserTaskId() {
        return doUserTaskId;
    }

    public void setDoUserTaskId(String doUserTaskId) {
        this.doUserTaskId = doUserTaskId;
    }

    public String getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(String userTaskId) {
        this.userTaskId = userTaskId;
    }

    public Date getDoTaskId() {
        return doTaskId;
    }

    public void setDoTaskId(Date doTaskId) {
        this.doTaskId = doTaskId;
    }

    public int getDoTaskDay() {
        return doTaskDay;
    }

    public void setDoTaskDay(int doTaskDay) {
        this.doTaskDay = doTaskDay;
    }
}
