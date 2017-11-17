package com.study.databasechoose;

import com.study.databasechoose.utils.IDbOperation;
import com.study.databasechoose.utils.Utils;

import java.util.List;

import io.objectbox.Box;

/**
 * 2017/11/16
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public class DbOperation implements IDbOperation {
    private Box<User> userBox;

    public DbOperation() {
        userBox = ((App)Utils.getApp()).getBoxStore().boxFor(User.class);
    }

    /**
     * 新增用户
     * @param user
     */
    @Override
    public void addUser(User user){
        userBox.put(user);
    }

    /**
     * 查询所有用户数据
     * @return
     */
    @Override
    public List<User> queryUser() {
        return userBox.getAll();
    }
}
