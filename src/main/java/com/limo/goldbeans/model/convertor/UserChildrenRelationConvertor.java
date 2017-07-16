package com.limo.goldbeans.model.convertor;

import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.model.BaseModel;
import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.model.user.ChildrenModel;
import com.limo.goldbeans.model.user.UserChildrenRelationModel;
import com.limo.goldbeans.utils.IdGeneratorUtil;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class UserChildrenRelationConvertor {

    public static UserChildrenRelationModel converToUserChildrenRelation(UserRegisterRequest request, ChildrenModel children){
        if( request == null || children == null) {
            return null;
        }
        UserChildrenRelationModel userChildrenRelationModel = new UserChildrenRelationModel();
        userChildrenRelationModel.setUserChildrenRelationId(IdGeneratorUtil.generatorIdByType(IdType.USER_CHILDREN_RELATION_TABLE));

        userChildrenRelationModel.setUserId(request.getUserId());
        userChildrenRelationModel.setChildrenId(children.getChildrenId());

        return userChildrenRelationModel;
    }

}
