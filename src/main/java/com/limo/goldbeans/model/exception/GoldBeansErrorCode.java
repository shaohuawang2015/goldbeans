package com.limo.goldbeans.model.exception;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public enum GoldBeansErrorCode implements ErrorCode {

    SUCCESS("000", "success"),

    SYSTEM_ERROR("001", "system error");

    private final String errorCode;

    private final String errorMsg;

    private GoldBeansErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }
}
