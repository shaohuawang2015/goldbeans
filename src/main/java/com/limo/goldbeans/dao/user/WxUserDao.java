package com.limo.goldbeans.dao.user;

import com.limo.goldbeans.model.user.WxUserModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
@Repository
public interface WxUserDao {

    /**
     * 插入微信用户
     * @param wxUserModel
     */
    void insertWxUser(WxUserModel wxUserModel);

    /**
     * 根据openId 查询
     * @param openId
     * @return
     */
    WxUserModel queryWxUserByOpenId(@Param("openId")String openId);
}
