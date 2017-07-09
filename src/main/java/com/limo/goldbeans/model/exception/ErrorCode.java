package com.limo.goldbeans.model.exception;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public interface ErrorCode {

    /**
     * 获取错误码
     * @return
     */
    String getErrorCode();

    /**
     * 获取错误信息
     * @return
     */
    String getErrorMsg();
}
