package com.zxl.zlibrary.http.ext2xtkj;

import com.alibaba.fastjson.JSONObject;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by minyu on 15/12/2.
 */
public class JsonParams {
    String jsonkey = "p";
    JSONObject json = new JSONObject();

    public JsonParams() {
    }

    public JsonParams(String jsonkey) {
        this.jsonkey = jsonkey;
    }

    public JsonParams(int pageIndex, int pageSize) {
        json.put("pageNum", pageIndex);
        json.put("pageSize", pageSize);
    }

    public void addParams(String key, Object value) {
        json.put(key, value);
    }

    public Map<String, String> getParmas() {
        Map<String, String> map = new IdentityHashMap<>();
        map.put(jsonkey, json.toString());
        return map;
    }

    public String toString() {
        return json.toString();
    }

}
