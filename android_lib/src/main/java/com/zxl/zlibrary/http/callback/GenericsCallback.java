package com.zxl.zlibrary.http.callback;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Response;

/**
 * Created by JimGong on 2016/6/23.
 */

public abstract class GenericsCallback<T> extends Callback<T> {
    IGenericsSerializator mGenericsSerializator;

    public GenericsCallback(IGenericsSerializator serializator) {
        mGenericsSerializator = serializator;
    }

    @Override
    public T parseNetworkResponse(Response response, int id) throws IOException {
        if (validateData == null) {
            //表示没有数据
            return null;
        }
        Type superclass = getClass().getGenericSuperclass();
        if (superclass instanceof Class) {
            //表示未设置泛型T
            return null;
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        Type mType = parameterized.getActualTypeArguments()[0];
        if (mType == String.class) {
            return (T) validateData;
        } else {
            T bean = mGenericsSerializator.transform(validateData, mType);
            return bean;
        }
    }

}
