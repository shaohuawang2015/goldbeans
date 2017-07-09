package com.limo.goldbeans.facade.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by shaohua.wsh on 2017/7/8.
 * 返回结果基类
 */
public class BaseResponse implements Serializable{

    /** sid */
    private static final long serialVersioUID = 1286252242937865343L;

    /** 返回结果是否成功 */
    protected boolean success;

    /** 错误信息 */
    protected String errMsg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    /**
     * 对象转换为字符串
     */
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
