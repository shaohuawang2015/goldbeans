package com.limo.goldbeans.facade.response.DTO;

import com.limo.goldbeans.facade.response.BaseResponse;

/**
 * Created by shaohua.wsh on 2017/7/17.
 */
public class TaskDTO extends BaseResponse {
    private static final long serialVersionUID = 8465450598803140430L;

    private String taskId;

    private String taskDesc;

    private String taskImage;

    private int days;

    /** 任务积分 */
    private int point;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getTaskImage() {
        return taskImage;
    }

    public void setTaskImage(String taskImage) {
        this.taskImage = taskImage;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
