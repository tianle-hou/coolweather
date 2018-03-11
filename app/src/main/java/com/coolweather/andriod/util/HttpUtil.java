package com.coolweather.andriod.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by houti on 2018/3/10.
 * 实现和服务器的交互
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
