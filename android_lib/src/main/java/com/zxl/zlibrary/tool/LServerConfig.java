package com.zxl.zlibrary.tool;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import java.io.IOException;
import java.util.Properties;


/**
 * 如果需要指定server_config(你需要在你的项目中手创建assets目录，然后在该目录下创建xxx.properties，默认server_config.properties)的文件名，需要在meta里面配置如：
 * <meta-data android:name="config_name" android:value="xxx.properties"/>
 *
 * @author Xianling.Zhou
 * @since 2017/10/13
 */
public class LServerConfig {
    private static Properties props = new Properties();

    /**
     * 初始化方法
     *
     * @param context
     */
    public static void initServerConfig(Context context) {
        try {
            String configname = "";
            try {
                ApplicationInfo appInfo = context.getPackageManager()
                        .getApplicationInfo(context.getPackageName(),
                                PackageManager.GET_META_DATA);
                configname = appInfo.metaData.getString("config_name");
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            if (TextUtils.isEmpty(configname)) {
                configname = "server_config.properties";
            }
            props.load(context.getResources().getAssets().open(configname));
        } catch (IOException e) {
            LogTool.e("init server_config error:" + e.getLocalizedMessage());
        }
    }

    public static String getValue(String key) {
        return props.getProperty(key);
    }


}
