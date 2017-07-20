package com.limo.goldbeans.model.user;

import com.limo.goldbeans.model.BaseModel;

import java.util.Date;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
public class UserTaskModel extends BaseModel {

    private String userTaskId;

    private String userId;

    private String childrenId;

    private String taskId;

    private int taskStar;

    private Date taskStartTime;

    private Date taskEndTime;

    private int  completeDays;


    public String getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(String userTaskId) {
        this.userTaskId = userTaskId;
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public int getTaskStar() {
        return taskStar;
    }

    public void setTaskStar(int taskStar) {
        this.taskStar = taskStar;
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Date getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public int getCompleteDays() {
        return completeDays;
    }

    public void setCompleteDays(int completeDays) {
        this.completeDays = completeDays;
    }
}
