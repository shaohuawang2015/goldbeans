package com.limo.goldbeans.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.admin.UserLoginRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.admin.DataBaseResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 后台登录管理
 */
@Controller
public class LoginManageController extends BaseController {
    /**
     * 日志
     */
    private Logger logger = Logger.getLogger(LoginManageController.class);

    @RequestMapping(value = "/admin/login.json", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public DataBaseResponse<String> userLogin(@RequestBody UserLoginRequest request, HttpServletResponse baseResponse) {
        final DataBaseResponse<String> response = new DataBaseResponse<>();
        WebProcessTemplate.excute(response, new WebProcessCallBack<DataBaseResponse<String>>() {
            @Override
            public void preProcess() {
                logger.info("userLogin=" + request);
            }

            @Override
            public DataBaseResponse<String> process() {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", "0000");
                jsonObject.put("deadline", new Date().getTime());
                Cookie cookie = new Cookie("token", jsonObject.toJSONString());

                cookie.setMaxAge(900000);
                cookie.setHttpOnly(true);
                baseResponse.addCookie(cookie);
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }
}
