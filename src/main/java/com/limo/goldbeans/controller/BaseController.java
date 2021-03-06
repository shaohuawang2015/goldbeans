package com.limo.goldbeans.controller;

import com.limo.goldbeans.facade.request.BaseRequest;
import com.limo.goldbeans.service.user.UserManageService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

/**
 * Created by shaohua.wsh on 2017/7/8.
 * Controller 基类
 */
public class BaseController {

    /** 日志 */
    private Logger logger = Logger.getLogger(BaseRequest.class);

    @Resource
    protected UserManageService userManageService;

    /**
     * 日志
     * @param request
     */
    protected void writeRequestLog(BaseRequest request){
        logger.info(request==null?"":request.toString());
    }
}
