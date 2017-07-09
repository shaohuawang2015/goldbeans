package com.limo.goldbeans.controller.user;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by shaohua.wsh on 2017/7/8.
 *  User 管理接口
 */

@Controller
public class UserManageController extends BaseController{

    /** 日志 */
    private Logger logger = Logger.getLogger(UserManageController.class);

    @RequestMapping(value = "/user/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String showUser(ModelMap modelMap,@RequestBody UserRegisterRequest request){
        WebProcessTemplate.excute(modelMap, new WebProcessCallBack<BaseResponse>() {
            @Override
            public void preProcess() {
                writeRequestLog(request);
            }

            @Override
            public BaseResponse process() {
                return null;
            }

            @Override
            public void fillResponse(BaseResponse reponse, ModelMap modelMap) {

            }
        });
        logger.info("查询所有用户信息"+ request.toString());
        return "showUser";
    }

}
