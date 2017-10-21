package com.zxl.zlibrary.http.callback;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

public abstract class Callback<T>
{
    /**
     * 用于验证数据合法性后,生成需要的数据对象
     */
    public String validateData;

    /**
     * UI Thread
     *
     * @param request
     */
    public void onBefore(Request request, int id)
    {
    }

    /**
     * UI Thread
     *
     * @param
     */
    public void onAfter(int id)
    {
    }

    /**
     * UI Thread
     *
     * @param progress
     */
    public void inProgress(float progress, long total , int id)
    {

    }

    /**
     * 自定义验证数据合法性
     * @param response
     * @param id
     * @return 返回null表示没有错误,String为数据出错原因
     */
    public String validateReponse(Response response, int id) throws Exception
    {
        return null;
    }

    /**
     * Thread Pool Thread
     *
     * @param response
     */
    public abstract T parseNetworkResponse(Response response, int id) throws Exception;

    public abstract void onError(Call call, Exception e, int id);

    public abstract void onResponse(T response, int id);


    public static Callback CALLBACK_DEFAULT = new Callback()
    {

        @Override
        public Object parseNetworkResponse(Response response, int id) throws Exception
        {
            return null;
        }

        @Override
        public void onError(Call call, Exception e, int id)
        {

        }

        @Override
        public void onResponse(Object response, int id)
        {

        }
    };

}