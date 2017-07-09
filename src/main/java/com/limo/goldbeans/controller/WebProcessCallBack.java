package com.limo.goldbeans.controller;

import com.limo.goldbeans.facade.response.BaseResponse;
import org.codehaus.jackson.map.Serializers;
import org.springframework.ui.ModelMap;

/**
 * Created by shaohua.wsh on 2017/7/8.
 * webprocess call back
 */
public interface WebProcessCallBack<R extends BaseResponse> {

    /**
     *  请求预处理
     */
    public void preProcess();

    /**
     * 请求处理
     * @return 返回结果
     */
    public R process();

    /**
     * 结果回填
     */
    public void fillResponse(R reponse, ModelMap modelMap);
}
