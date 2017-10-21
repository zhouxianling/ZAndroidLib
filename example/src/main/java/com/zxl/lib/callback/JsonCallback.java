package com.zxl.lib.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zxl.zlibrary.http.callback.GenericsCallback;
import com.zxl.zlibrary.http.callback.IGenericsSerializator;
import com.zxl.zlibrary.http.callback.JsonGenericsSerializator;
import com.zxl.zlibrary.tool.LogTool;

import okhttp3.Response;

/**
 * @author Xianling.Zhou
 * @since 2017/10/21
 */

public abstract class JsonCallback<T> extends GenericsCallback<T> {

    public JsonCallback(IGenericsSerializator serializator) {
        super(new JsonGenericsSerializator());
    }

    @Override
    public String validateReponse(Response response, int id) throws Exception {
        JSONObject json = JSON.parseObject(response.body().string());
        if (json == null) {
            return ("Response is not json data!");
        } else {
            LogTool.d("response:" + json.toJSONString());
            String data = json.getString("data");
            String ecode = json.getString("code");//该值的约定可变
            String msg = json.getString("message");//该值的约定可变

            if (ecode.equals("200")) {
                validateData = data;
            } else if (ecode.equals("400100")) {
                return msg;
            } else {
                return msg;
            }
        }

        return null;
    }
}
