package com.study.databasechoose.utils;

import com.study.databasechoose.User;

import java.util.List;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description: 用户数据操作接口
 *
 * @author yutt
 */

public interface IDbOperation {
    void addUser(User user);

    List<User> queryUser();
}
