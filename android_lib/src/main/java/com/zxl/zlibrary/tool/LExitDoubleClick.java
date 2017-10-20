/*
 * @(#)ExitDoubleClick.java		       Project:com.sinaapp.msdxblog.androidkit
 * Date:2012-3-20
 *
 * Copyright (c) 2011 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 */
package com.zxl.zlibrary.tool;

import android.app.Activity;
import android.content.Context;

/**
 * 双击退出Activity的类。
 *
 * @author Xianling.Zhou
 * @since 2017/10/20
 */
public class LExitDoubleClick extends LDoubleClick {

    private static LExitDoubleClick exit;

    private LExitDoubleClick(Context context) {
        super(context);
        setDoubleClickListener(new DoubleClickListener() {
            @Override
            public void afteDoubleClick() {
                ((Activity) mContext).finish();
                destroy();
            }
        });
    }

    /**
     * 返回一个双击退出的实例。
     *
     * @param context
     * @return ExitDoubleClick
     */
    public static synchronized LExitDoubleClick getInstance(Context context) {
        if (exit == null) {
            exit = new LExitDoubleClick(context);
        }
        return exit;
    }

    /**
     * 双击退出Activity，如果msg为null，而默认显示的提示语为"再按一次退出"。
     */
    @Override
    public void doDoubleClick(int delayTime, String msg) {
        if (msg == null || msg.equals("")) {
            msg = "再按一次退出";
        }
        super.doDoubleClick(delayTime, msg);
    }

    private static void destroy() {
        exit = null;
    }
}
