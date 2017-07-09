package com.limo.goldbeans.controller;

import com.limo.goldbeans.facade.response.BaseResponse;
import com.limo.goldbeans.model.exception.GoldBeansErrorCode;
import com.limo.goldbeans.model.exception.GoldBeansException;
import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.ui.ModelMap;

/**
 * Created by shaohua.wsh on 2017/7/8.
 * Web 处理模板
 */
public class WebProcessTemplate {

    /** 日志 */
    private static  Logger logger = Logger.getLogger(WebProcessTemplate.class);

    /**
     *  web process 统一模板
     * @param modelMap
     * @param callBack
     * @param <R>
     */
    public final static <R extends BaseResponse> void excute(ModelMap modelMap, WebProcessCallBack<R> callBack){

        R reponse = null;
        try{
            callBack.preProcess();

            reponse = callBack.process();

            callBack.fillResponse(reponse, modelMap);
        }catch (Exception ex){
            logger.warn("web process template error.", ex);
            processException(modelMap, ex);
        }finally {
            if(reponse != null && reponse.isSuccess()){
                logger.info("web process success.");
            }
        }
    }

    /**
     * 处理返回的异常结果
     * @param modelMap
     * @param ex
     */
    public static  void processException(ModelMap modelMap,Exception ex){
        modelMap.put(WebConstants.SUCCESS, false);
        String errorCode = "";
        String errorMsg = "";
        if(ex instanceof GoldBeansException) {
            modelMap.put(WebConstants.ERROR_CODE, ((GoldBeansException) ex).getGoldBeansErrorCode());
        }else{
            modelMap.put(WebConstants.ERROR_CODE, GoldBeansErrorCode.SYSTEM_ERROR);
        }
        modelMap.put(WebConstants.ERROR_MSG, ex.getMessage());
    }
}
