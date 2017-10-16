package com.zxl.zlibrary.tool;

import android.content.Context;

/**
 * @author Xianling.Zhou
 * @since 2017/10/11
 */
public class LTool {

    private static Context context;

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        LTool.context = context.getApplicationContext();
        // 初始化配置assets文件模块
        LServerConfig.initServerConfig(context);
    }

    /**
     * 在某种获取不到 Context 的情况下，即可以使用才方法获取 Context
     * <p>
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("请先调用init()方法");
    }

}
