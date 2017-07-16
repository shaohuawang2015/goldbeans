package com.limo.goldbeans.model.convertor;

import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.model.user.ChildrenModel;
import com.limo.goldbeans.utils.IdGeneratorUtil;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class ChildrenConvertor {

    public static ChildrenModel convertToChildren(UserRegisterRequest request) {
        if (request == null) {
            return null;
        }
        ChildrenModel childrenModel = new ChildrenModel();
        childrenModel.setChildrenName(request.getChildrenName());
        childrenModel.setHeadic(request.getHeadic());
        childrenModel.setAge(request.getAge());
        childrenModel.setLocation(request.getLaction());

        childrenModel.setChildrenId(IdGeneratorUtil.generatorIdByType(IdType.CHILDREN_TABLE));
        childrenModel.setPoint(0);
        childrenModel.setVip(0);

        return childrenModel;
    }
}
