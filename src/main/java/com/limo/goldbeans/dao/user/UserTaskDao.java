package com.limo.goldbeans.dao.user;

import com.limo.goldbeans.model.user.UserTaskModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shaohua.wsh on 2017/7/20.
 */
@Repository
public interface UserTaskDao {

    public void createUserTask(UserTaskModel userTaskModel);

    public List<UserTaskModel> queryUserTaskList();

}
