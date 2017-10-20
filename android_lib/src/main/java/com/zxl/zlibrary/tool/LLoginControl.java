package com.zxl.zlibrary.tool;

import android.content.Context;
import android.text.TextUtils;


/**
 * LLoginControl通过SharePreference对账号密码进行保存。
 *
 * @author Xianling.Zhou
 * @since 2017/10/19
 */
public class LLoginControl {

    public static String readLoginName(Context context) {
        LKVTool LKVTool = new LKVTool(context, "loginInfo", 0);
        return LKVTool.getString("loginName", "");
    }

    public static void saveLoginName(Context context, String loginName) {
        LKVTool LKVTool = new LKVTool(context, "loginInfo", 0);
        LKVTool.commit("loginName", loginName);
    }

    public static void clearLoginName(Context context, String loginName) {
        LKVTool LKVTool = new LKVTool(context, "loginInfo", 0);
        LKVTool.remove("loginName");
        LKVTool.remove(loginName);
        LKVTool.commit();
    }

    public static void savePasswordForName(Context context, String name, String pwd) {
        LKVTool LKVTool = new LKVTool(context, "loginInfo", 0);
        try {
            LKVTool.commit(name, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readPasswordForName(Context context, String name) {
        LKVTool LKVTool = new LKVTool(context, "loginInfo", 0);
        String codepwd = LKVTool.getString(name, null);
        if (!TextUtils.isEmpty(codepwd)) {
            try {
                return codepwd;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
