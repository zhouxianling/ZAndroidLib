package com.zxl.lib;

import android.app.Application;

import com.zxl.zlibrary.tool.LTool;

/**
 * @author Xianling.Zhou
 * @since 2017/10/14
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //使用工具类必须先初始化
        LTool.init(this);

    }
}
