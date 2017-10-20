package com.rongwei.yxfconclusionutils.http;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import com.rongwei.yxfconclusionutils.utils.JsonUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * Created by MengJie on 2017/1/20.
 */

public class HttpUtils {
    private static final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType MEDIA_TYPE_STREAM = MediaType.parse("application/octet-stream");

    private static String webUrl = "";
    private static OkHttpClient okHttpClient;

    static {
        okHttpClient = new OkHttpClient();
        //http
        /*okHttpClient.newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();*/

        //https
        SSLUtils.SSLParams sslParams = SSLUtils.getSslSocketFactory(new InputStream[]{null});
        okHttpClient.newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .hostnameVerifier(SSLUtils.UnSafeHostnameVerifier)
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                .build();
    }

    /**
     * get 请求    okhttp默认就是get请求   如果请求需要带参数那么就要使用post请求
     *
     *
     * @param url
     * @param callback
     */
    public static void sendRequest(String url, Callback callback) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 获取图片
     *
     * @param url
     * @return
     */
    public static Bitmap getBitmap(String url) {
        Bitmap bitmap = null;
        Request request = new Request.Builder().url(url).build();
        try {
            ResponseBody body = okHttpClient.newCall(request).execute().body();
            bitmap = BitmapFactory.decodeStream(body.byteStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    /**
     * post obj ->json 或 obj ->form
     *
     * @param url
     * @param obj
     * @param callback
     * @param <T>
     * @throws IllegalAccessException
     */
    public static <T> void sendRequest(String url, T obj, Callback callback) {
        //post json
        /*String json = JsonUtils.toJson(obj);
        RequestBody body = RequestBody.create(MEDIA_TYPE_MARKDOWN, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();*/

        //post 键值对  可以只添加部分参数 比如更新用户信息是需要用到
        /*FormBody.Builder builder = new FormBody.Builder();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                String value = String.valueOf(field.get(obj));
                if (!TextUtils.isEmpty(value)) {
                    builder.add(field.getName(), value);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        FormBody body = builder.build();*/

        FormBody.Builder builder = new FormBody.Builder();
        String json = JsonUtils.toJson(obj);
        try {
            JSONObject jsonObject = new JSONObject(json);
            Iterator<String> keys = jsonObject.keys();
            String key;
            while (keys.hasNext()) {
                key = keys.next();
                builder.add(key, jsonObject.getString(key));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        FormBody body = builder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * post map -> form
     *
     * @param url
     * @param map
     * @param callback
     */
    public static void sendRequest(String url, Map<String, String> map, Callback callback) {
        //post 键值对
        FormBody.Builder builder = new FormBody.Builder();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            builder.add(entry.getKey(), entry.getValue());
        }
        FormBody body = builder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 上传文件
     */
    public static void  sendRequest(String url, RequestBody body, Callback callBack){
        Request request = new Request.Builder().url(url).post(body).build();
        okHttpClient.newCall(request).enqueue(callBack);
    }


}
