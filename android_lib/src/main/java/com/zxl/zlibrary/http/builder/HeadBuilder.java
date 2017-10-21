package com.zxl.zlibrary.http.builder;


import com.zxl.zlibrary.http.OkHttpUtils;
import com.zxl.zlibrary.http.request.OtherRequest;
import com.zxl.zlibrary.http.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
