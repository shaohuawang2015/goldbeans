package com.limo.goldbeans.facade.request;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by shaohua.wsh on 2017/7/8.
 */
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = 8881140412955896568L;

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
