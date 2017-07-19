package com.limo.goldbeans.controller.category;

import com.limo.goldbeans.controller.BaseController;
import com.limo.goldbeans.controller.WebProcessCallBack;
import com.limo.goldbeans.controller.WebProcessTemplate;
import com.limo.goldbeans.facade.request.CategoryCreateRequest;
import com.limo.goldbeans.facade.request.UserRegisterRequest;
import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.facade.response.UserRegisterResponse;
import com.limo.goldbeans.model.user.ChildrenModel;
import com.limo.goldbeans.service.category.CategoryManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by shaohua.wsh on 2017/7/18.
 */
@Controller
public class CategoryManageController extends BaseController{

    @Resource
    CategoryManageService categoryManageService;

    @RequestMapping(value = "/category/create", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public BaseResponse createCategory(@RequestBody CategoryCreateRequest request){
        final BaseResponse response = new BaseResponse();
        WebProcessTemplate.excute(response, new WebProcessCallBack<BaseResponse>() {
            @Override
            public void preProcess() {
                writeRequestLog(request);
            }

            @Override
            public BaseResponse process() {
                categoryManageService.createCategory(request);
                return response;
            }

            @Override
            public void afterProcess(BaseResponse response) {

            }
        });
        return response;
    }



}
