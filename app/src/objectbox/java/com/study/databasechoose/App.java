package com.study.databasechoose;

import io.objectbox.BoxStore;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public class App extends BaseApp {
    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        initBox();
    }

    /**
     * 初始化Box
     */
    private void initBox() {
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}
