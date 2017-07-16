package com.limo.goldbeans.controller.user;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.QueryChildrenInfoRequest;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.QueryChildrenInfoResponse;
import com.limo.goldbeans.facade.response.UserRegisterResponse;
import com.limo.goldbeans.model.user.ChildrenModel;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shaohua.wsh on 2017/7/8.
 *  User 管理接口
 */
@Controller
public class UserManageController extends BaseController{

    /** 日志 */
    private Logger logger = Logger.getLogger(UserManageController.class);

    @RequestMapping(value = "/user/register", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public UserRegisterResponse registerUser(@RequestBody UserRegisterRequest request){
        final UserRegisterResponse response = new UserRegisterResponse();
        WebProcessTemplate.excute(response, new WebProcessCallBack<UserRegisterResponse>(){

            @Override
            public void preProcess() {
                writeRequestLog(request);
            }

            @Override
            public UserRegisterResponse process() {
                ChildrenModel childrenModel = userManageService.createChild(request);
                response.setChildrenId(childrenModel.getChildrenId());
                response.setPonit(childrenModel.getPoint());
                response.setVip(childrenModel.getVip());
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }


    @RequestMapping(value="/query/childrenInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public QueryChildrenInfoResponse queryChildrenInfoByUserId(@RequestBody QueryChildrenInfoRequest request){

        final QueryChildrenInfoResponse response = new QueryChildrenInfoResponse();
        WebProcessTemplate.excute(response, new WebProcessCallBack<QueryChildrenInfoResponse>() {
            @Override
            public void preProcess() {
                writeRequestLog(request);
            }

            @Override
            public QueryChildrenInfoResponse process() {
                ChildrenModel childrenModel = userManageService.queryChildrenByUserId(request);
                if(childrenModel == null) {
                    return response;
                }
                response.setChildrenId(childrenModel.getChildrenId());
                response.setChildrenName(childrenModel.getChildrenName());
                response.setHeadic(childrenModel.getHeadic());
                response.setAge(childrenModel.getAge());
                response.setPoint(childrenModel.getPoint());
                response.setVip(childrenModel.getVip());
                response.setLaction(childrenModel.getLocation());

                return  response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }

}
