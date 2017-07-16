package com.limo.goldbeans.dao.user;

import com.limo.goldbeans.model.user.UserChildrenRelationModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
@Repository
public interface UserChildrenRelationDao {

    /**
     * 创建userId与孩子的关联关系
     *
     * @param userChildrenRelationModel
     */
    void insertUserChildrenRelation(UserChildrenRelationModel userChildrenRelationModel);

    /**
     *  查询userId 与children 的关联实体
     *
     * @param userId
     * @return
     */
    UserChildrenRelationModel queryUserChildrenRelation(@Param("userId") String userId);
}
