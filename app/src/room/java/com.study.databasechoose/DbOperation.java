package com.study.databasechoose;

import com.study.databasechoose.utils.IDbOperation;

import java.util.List;

/**
 * 2017/11/16
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public class DbOperation implements IDbOperation {

    public DbOperation() {

    }

    /**
     * 新增用户
     * @param user
     */
    @Override
    public void addUser(User user){

    }

    /**
     * 查询所有用户数据
     * @return
     */
    @Override
    public List<User> queryUser() {
        return null;
    }
}
