package com.limo.goldbeans.dao.user;

import com.limo.goldbeans.model.user.DoUserTaskModel;
import org.springframework.stereotype.Repository;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
@Repository
public interface DoUserTaskDao {

    /** 做任务记录 */
    public void createDoUserTask(DoUserTaskModel doUserTaskModel);
}
