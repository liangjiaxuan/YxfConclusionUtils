package com.rongwei.yxfconclusionutils.app;

import android.app.Application;

import com.rongwei.yxfconclusionutils.exception.CrashHandler;

/**
 * Created by Administrator on 2017/10/20.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler instance = CrashHandler.getInstance();
        instance.init(getApplicationContext());
    }
}
