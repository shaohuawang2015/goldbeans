package com.limo.goldbeans.controller;

import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.model.exception.GoldBeansErrorCode;
import com.limo.goldbeans.model.exception.GoldBeansException;
import org.apache.log4j.Logger;

/**
 * Created by shaohua.wsh on 2017/7/8.
 * Web 处理模板
 */
public class WebProcessTemplate {

    /** 日志 */
    private static  Logger logger = Logger.getLogger(WebProcessTemplate.class);

    /**
     *  web process 统一模板
     * @param callBack
     * @param <R>
     */
    public final static <R extends BaseResponse> void excute(R reponse, WebProcessCallBack<R> callBack){

        try{
            callBack.preProcess();

            reponse = callBack.process();

            callBack.afterProcess(reponse);
            // 正常结果为true
            reponse.setSuccess(true);
        }catch (Exception ex){
            logger.warn("web process template error.", ex);
            processException(reponse, ex);
        }finally {
            if(reponse.isSuccess()){
                logger.info("web process success.");
            }
        }
    }

    /**
     * 处理返回的异常结果
     * @param response
     * @param ex
     */
    public static  void processException(BaseResponse response, Exception ex){
        response.setSuccess(false);
        if(ex instanceof GoldBeansException) {
            response.setErrMsg(((GoldBeansException) ex).getGoldBeansErrorCode().getErrorCode());
        }else {
            response.setErrMsg(GoldBeansErrorCode.SYSTEM_ERROR.getErrorCode());
        }
    }
}
