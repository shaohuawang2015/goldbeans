package com.limo.goldbeans.model.convertor;

import com.limo.goldbeans.facade.request.CategoryTaskCreateRequest;
import com.limo.goldbeans.facade.response.DTO.TaskDTO;
import com.limo.goldbeans.model.category.CategoryTaskModel;
import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.utils.IdGeneratorUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/19.
 */
public class CategoryTaskConvertor {

    public static  CategoryTaskModel convertToModel(CategoryTaskCreateRequest request){
        if(request == null){
            return null;
        }

        CategoryTaskModel model = new CategoryTaskModel();
        model.setCategoryId(request.getCategoryId());
        model.setTaskId(IdGeneratorUtil.generatorIdByType(IdType.CATEGORY_TASK_TABLE));
        model.setTaskTitle(request.getTaskTitle());
        model.setTaskDesc(request.getTaskDesc());
        model.setTaskImage(request.getTaskImage());
        model.setHonorId(request.getHonorId());
        model.setDays(request.getDays());
        model.setPoint(request.getPoint());

        return model;

    }

    public static TaskDTO covertToDTO(CategoryTaskModel categoryTaskModel){
        if(categoryTaskModel == null){
            return null;
        }

        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTaskId(categoryTaskModel.getTaskId());
        taskDTO.setTaskImage(categoryTaskModel.getTaskImage());
        taskDTO.setTaskDesc(categoryTaskModel.getTaskDesc());
        taskDTO.setTaskImage(categoryTaskModel.getTaskImage());
        taskDTO.setHonorId(categoryTaskModel.getHonorId());
        taskDTO.setDays(categoryTaskModel.getDays());
        taskDTO.setPoint(categoryTaskModel.getPoint());

        return taskDTO;
    }

    public static List<TaskDTO> convertToDTOs(List<CategoryTaskModel> categoryTaskModelList){
        if(categoryTaskModelList == null){
            return Collections.emptyList();
        }
        List<TaskDTO> taskDTOS = new ArrayList<>();
        for(CategoryTaskModel model: categoryTaskModelList){
            taskDTOS.add(covertToDTO(model));
        }
        return taskDTOS;
    }

}
