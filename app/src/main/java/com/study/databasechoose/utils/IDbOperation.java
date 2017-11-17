package com.study.databasechoose;

import java.util.List;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public interface IDbOperation {
    void addUser(User user);

    List<User> queryUser();
}
