package com.limo.goldbeans.model.category;

import com.limo.goldbeans.model.BaseModel;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
public class HonorModel extends BaseModel {

    private String honorId;

    private String honorName;

    private String honorDesc;

    private String honorImage;

    public String getHonorId() {
        return honorId;
    }

    public void setHonorId(String honorId) {
        this.honorId = honorId;
    }

    public String getHonorName() {
        return honorName;
    }

    public void setHonorName(String honorName) {
        this.honorName = honorName;
    }

    public String getHonorDesc() {
        return honorDesc;
    }

    public void setHonorDesc(String honorDesc) {
        this.honorDesc = honorDesc;
    }

    public String getHonorImage() {
        return honorImage;
    }

    public void setHonorImage(String honorImage) {
        this.honorImage = honorImage;
    }
}
