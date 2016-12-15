package com.lxy.heart;

import android.app.Application;
import android.content.pm.ApplicationInfo;

/**
 * Created by liuxinyu on 2016/12/15.
 */

public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();
    private static MyApplication instance;

    private static final Thread initSDKThread = new Thread() {
        @Override
        public void run() {
        }
    };

    public static MyApplication getInstance() {
        return instance;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initSDKThread.start();
    }
}
