package com.limo.goldbeans.model.convertor;

import com.alibaba.fastjson.JSONObject;
import com.limo.goldbeans.model.domain.IdType;
import com.limo.goldbeans.model.user.WxUserModel;
import com.limo.goldbeans.utils.IdGeneratorUtil;
import org.omg.CORBA.IDLType;

import java.util.UUID;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
public class WxUserConvertor {

    public static WxUserModel covertToWxUserModel(JSONObject jsonObject){

        if(jsonObject == null){
            return null;
        }

        WxUserModel wxUserModel = new WxUserModel();

        wxUserModel.setUserId(IdGeneratorUtil.generatorIdByType(IdType.WX_USER_TABLE));

        wxUserModel.setOpenId((String)jsonObject.get("openid"));

        wxUserModel.setWxSessionId(((String)jsonObject.get("session_key")));

        wxUserModel.setSessionId(UUID.randomUUID().toString());

        return wxUserModel;
    }
}
