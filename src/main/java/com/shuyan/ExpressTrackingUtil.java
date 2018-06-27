package com.shuyan;

import okhttp3.*;

import java.io.IOException;

public class ExpressTrackingUtil {
    public static final String EXPRESS_SF = "shunfeng";
    public static final String EXPRESS_EMS = "ems";
    public static final String EXPRESS_DEBANG = "debangwuliu";

    private static final OkHttpClient client = new OkHttpClient();
    private static final String url = "http://express.woyueche.com/query.action";
    private static final String hearKey = "Authorization";
    private static final String hearValue = "APPCODE ba8d66a2d133448a9bfd1b57c6fb7c03";
    private static final String expressKey = "express";
    private static final String trackingNoKey = "trackingNo";

    public static String expressTracking(String express, String trackingNo) {
        RequestBody formBody = new FormBody.Builder()
                .add(expressKey, express)
                .add(trackingNoKey, trackingNo)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .addHeader(hearKey, hearValue)
                .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .post(formBody)
                .build();

        try{
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful())
                throw new RuntimeException("物流信息请求失败 ：" + response);
            if(response.body() == null)
                throw new RuntimeException("物流信息查询响应错误 ：" + response);
            return response.body().string();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
