package com.limo.goldbeans.model.exception;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public class GoldBeansException extends  RuntimeException {
    private static final long serialVersionUID = 1495095072023647442L;

    private GoldBeansErrorCode goldBeansErrorCode;

    public GoldBeansException(String errorMsg){
        super(errorMsg);
    }
    public GoldBeansException(GoldBeansErrorCode goldBeansErrorCode, Throwable t){
        super(goldBeansErrorCode.getErrorMsg(), t);
        this.goldBeansErrorCode = goldBeansErrorCode;
    }

    public GoldBeansException(GoldBeansErrorCode goldBeansErrorCode,String errorMsg){
        super(goldBeansErrorCode.getErrorMsg());
        this.goldBeansErrorCode = goldBeansErrorCode;
    }

    public GoldBeansErrorCode getGoldBeansErrorCode() {
        return goldBeansErrorCode;
    }

    public void setGoldBeansErrorCode(GoldBeansErrorCode goldBeansErrorCode) {
        this.goldBeansErrorCode = goldBeansErrorCode;
    }
}
