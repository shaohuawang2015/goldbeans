package com.limo.goldbeans.service.user;

import com.alibaba.fastjson.JSONObject;
import com.limo.goldbeans.facade.request.QueryChildrenInfoRequest;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.model.user.ChildrenModel;
import com.limo.goldbeans.model.user.WxUserModel;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public interface UserManageService {

    WxUserModel createWxUser(JSONObject jsonObject);

    /**
     * 创建child 实体对象
     * @param request
     * @return
     */
    ChildrenModel createChild(UserRegisterRequest request);

    /**
     * 查询孩子注册实体
     *
     * @param request
     * @return
     */
    ChildrenModel queryChildrenByUserId(QueryChildrenInfoRequest request);
}
