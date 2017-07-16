package com.limo.goldbeans.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebConstants;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.Wx3rdSessionRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.Wx3rdSessionResponse;
import com.limo.goldbeans.model.exception.GoldBeansErrorCode;
import com.limo.goldbeans.model.user.WxUserModel;
import com.limo.goldbeans.service.user.UserManageService;
import com.limo.goldbeans.utils.AssertUtil;
import com.limo.goldbeans.utils.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * Created by shaohua.wsh on 2017/7/10.
 */
@Controller
public class WxOpenIdManageController extends BaseController {

    @RequestMapping(value = "/wx/query3rdSession", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Wx3rdSessionResponse query3rdSession(@RequestBody Wx3rdSessionRequest request) {

        final Wx3rdSessionResponse response = new Wx3rdSessionResponse();
        WebProcessTemplate.excute( response, new WebProcessCallBack<Wx3rdSessionResponse>() {
            @Override
            public void preProcess() {
                writeRequestLog(request);
            }

            @Override
            public Wx3rdSessionResponse process() {

                String url = WebConstants.WX_BASE_URL + "?" + WebConstants.APP_ID + "=" + WebConstants.APP_ID_VALUE +
                        "&" + WebConstants.SECRET_ID + "=" + WebConstants.SECRET_ID_VALUE +
                        "&" + WebConstants.JS_CODE + "=" + request.getJsCode() +
                        "&" + WebConstants.GRANT_TYPE + "=" + WebConstants.GRANT_TYPE_VALUE;
                JSONObject result = HttpClientUtil.httpGet(url);
                AssertUtil.notNull(result, GoldBeansErrorCode.SYSTEM_ERROR, "httpclient result is null.");
                WxUserModel wxUserModel = userManageService.createWxUser(result);
                response.setWx3rdSession(wxUserModel.getUserId());
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }
}
