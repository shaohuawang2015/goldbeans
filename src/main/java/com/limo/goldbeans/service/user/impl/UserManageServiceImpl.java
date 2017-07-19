package com.limo.goldbeans.service.user.impl;

import com.alibaba.fastjson.JSONObject;
import com.limo.goldbeans.dao.user.ChildrenDao;
import com.limo.goldbeans.dao.user.UserChildrenRelationDao;
import com.limo.goldbeans.dao.user.WxUserDao;
import com.limo.goldbeans.facade.request.QueryChildrenInfoRequest;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.model.convertor.ChildrenConvertor;
import com.limo.goldbeans.model.convertor.UserChildrenRelationConvertor;
import com.limo.goldbeans.model.convertor.WxUserConvertor;
import com.limo.goldbeans.model.user.ChildrenModel;
import com.limo.goldbeans.model.user.UserChildrenRelationModel;
import com.limo.goldbeans.model.user.WxUserModel;
import com.limo.goldbeans.service.user.UserManageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */

@Service
public class UserManageServiceImpl implements UserManageService {

    @Resource
    private WxUserDao wxUserDao;

    @Resource
    private ChildrenDao childrenDao;

    @Resource
    private UserChildrenRelationDao userChildrenRelationDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public WxUserModel createWxUser(JSONObject jsonObject) {
        WxUserModel wxUserModel = WxUserConvertor.covertToWxUserModel(jsonObject);

        // 幂等处理
        WxUserModel wxUserModelDB = wxUserDao.queryWxUserByOpenId(wxUserModel.getOpenId());
        if(wxUserModelDB != null) {
            return wxUserModelDB;
        }

        wxUserDao.insertWxUser(wxUserModel);
        return wxUserModel;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ChildrenModel createChild(UserRegisterRequest request) {
        ChildrenModel childrenModel = ChildrenConvertor.convertToChildren(request);
        UserChildrenRelationModel userChildrenRelationModel = UserChildrenRelationConvertor.converToUserChildrenRelation(request, childrenModel);

        childrenDao.insertChildren(childrenModel);
        userChildrenRelationDao.insertUserChildrenRelation(userChildrenRelationModel);

        return childrenModel;
    }

    @Override
    public ChildrenModel queryChildrenByUserId(QueryChildrenInfoRequest request) {
        UserChildrenRelationModel userChildrenRelationModel = userChildrenRelationDao.queryUserChildrenRelation(request.getUserId());
        if(userChildrenRelationModel == null){
            return null;
        }

        return childrenDao.queryChildrenInfo(userChildrenRelationModel.getChildrenId());
    }

}
