package com.limo.goldbeans.controller.admin;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.controller.user.UserManageController;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.facade.request.admin.UserLoginRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.UserRegisterResponse;
import com.limo.goldbeans.facade.response.admin.DataBaseResponse;
import com.limo.goldbeans.model.user.ChildrenModel;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public DataBaseResponse<String> userLogin(@RequestBody UserLoginRequest request) {
        final DataBaseResponse<String> response = new DataBaseResponse<>();
        WebProcessTemplate.excute(response, new WebProcessCallBack<DataBaseResponse<String>>() {
            @Override
            public void preProcess() {
                logger.info("userLogin=" + request);
            }

            @Override
            public DataBaseResponse<String> process() {
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }
}
