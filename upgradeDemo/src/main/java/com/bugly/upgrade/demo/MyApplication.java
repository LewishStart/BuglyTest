package com.bugly.upgrade.demo;

import android.app.Application;
import android.content.Context;


/**
 * Created by wenjiewu on 2016/5/23.
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        BuglyManager.getInstance().init();
    }

    public static Context getContext() {
        return mContext;
    }
}
