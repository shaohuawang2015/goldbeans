package com.limo.goldbeans.model.category;

import com.limo.goldbeans.model.BaseModel;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
public class CategoryTaskModel extends BaseModel {

    private String taskId;

    private String categoryId;

    private String taskDesc;

    private String taskImage;

    private int days;

    private int point;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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
