package com.study.databasechoose;

import com.study.databasechoose.utils.IDbOperation;
import com.study.databasechoose.utils.Utils;

import java.util.List;

/**
 * 2017/11/16
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */
public class DbOperation implements IDbOperation{

    @Override
    public void addUser(User user) {
        ((App)Utils.getApp()).getDatabase().dbDao().addUser(user);
    }

    @Override
    public List<User> queryUser() {
        return ((App)Utils.getApp()).getDatabase().dbDao().queryUser();
    }
}
