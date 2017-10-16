package com.zxl.zlibrary.tool;

/**
 * @author Xianling.Zhou
 * @since 2017/10/13
 */
public class LUrlControl {

    //这里是你项目的base url 在assets中配置
    public static String baseUrl;


    /**
     * //传入具体请求的后缀拼接成完成的URL
     *
     * @param key 具体请求数据的后缀
     * @return
     */
    public static String url(String key) {
        if (baseUrl == null) {
            baseUrl = LServerConfig.getValue("baseUrl");
        }
        String url = LServerConfig.getValue(key);
        if (url != null) {
            if (url.startsWith("http")) {
                return url;
            } else {
                return baseUrl + url;
            }
        } else {
            return baseUrl + key;
        }
    }
}
