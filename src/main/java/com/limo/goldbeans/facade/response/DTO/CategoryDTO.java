package com.limo.goldbeans.facade.response.DTO;

import com.limo.goldbeans.facade.response.BaseDTO;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/17.
 */
public class CategoryDTO extends BaseDTO {
    private static final long serialVersionUID = -227100604522397976L;

    private  String categoryId;

    private String categoryName;

    private int position;

    private List<TaskDTO> taskDTOList;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<TaskDTO> getTaskDTOList() {
        return taskDTOList;
    }

    public void setTaskDTOList(List<TaskDTO> taskDTOList) {
        this.taskDTOList = taskDTOList;
    }
}
