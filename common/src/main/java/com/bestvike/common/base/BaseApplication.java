package com.bestvike.common.base;

import android.app.Application;
import android.content.Context;


/**
 * Created by use on 2018/3/14.
 * 所有的组件都写一个Application 继承本文件，获取公共的Context
 */

public class BaseApplication extends Application{

    public static Context CONTEXT;

    @Override
    public void onCreate() {
        super.onCreate();
        CONTEXT = getApplicationContext();
    }
}
