package com.study.databasechoose;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public class App extends BaseApp {
    private UserDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();

        database = UserDatabase.getInstance(this);
    }

    public UserDatabase getDatabase() {
        return database;
    }
}
