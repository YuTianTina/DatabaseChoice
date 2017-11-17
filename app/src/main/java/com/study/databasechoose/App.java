package com.study.databasechoose;

import android.app.Application;

import com.study.databasechoose.utils.Utils;

import io.objectbox.BoxStore;

/**
 * 2017/11/17
 * e-mail: yutt@xinguangnet.com
 * Description:
 *
 * @author yutt
 */

public class App extends Application {
    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
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
