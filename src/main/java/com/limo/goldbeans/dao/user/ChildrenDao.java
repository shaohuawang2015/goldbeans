package com.limo.goldbeans.dao.user;

import com.limo.goldbeans.model.user.ChildrenModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shaohua.wsh on 2017/7/16.
 */
@Repository
public interface ChildrenDao {

    /**
     *  添加宝宝
     * @param childrenModel
     */
    void insertChildren(ChildrenModel childrenModel);

    /**
     * 查询宝宝实体
     *
     * @param childrenId
     * @return
     */
    ChildrenModel queryChildrenInfo(@Param("childrenId") String childrenId);
}
