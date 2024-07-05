package com.wood.automatic.common.utils;


import okhttp3.*;
import java.io.IOException;
import java.util.Map;

public class OKHttpUtil {

    private OkHttpClient client;
    //需要提供完善的HTTP封装和返回值的透传

    public OKHttpUtil() {
        client = new OkHttpClient.Builder().build();
    }

    public String get(String url, Map<String, Object> headers, Map<String, Object> params) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }

        Request.Builder requestBuilder = new Request.Builder().url(urlBuilder.build());
        if (headers != null) {
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                requestBuilder.addHeader(entry.getKey(), entry.getValue().toString());
            }
        }

        try (Response response = client.newCall(requestBuilder.build()).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String post(String url, String contentType, Map<String, Object> headers, Map<String, Object> params) {
        RequestBody requestBody = null;

        switch (contentType) {
            case "application/json":
                // Implement JSON request body creation using params
                break;
            case "application/xml":
                // Implement XML request body creation using params
                break;
            case "application/x-www-form-urlencoded":
                FormBody.Builder formBodyBuilder = new FormBody.Builder();
                if (params != null) {
                    for (Map.Entry<String, Object> entry : params.entrySet()) {
                        formBodyBuilder.add(entry.getKey(), entry.getValue().toString());
                    }
                }
                requestBody = formBodyBuilder.build();
                break;
            case "multipart/form-data":
                // Implement multipart request body creation using params
                break;
            case "application/octet-stream":
                // Implement octet-stream request body creation using params
                break;
            // Add more Content-Type cases as needed
        }

        Request.Builder requestBuilder = new Request.Builder().url(url).post(requestBody);
        if (headers != null) {
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                requestBuilder.addHeader(entry.getKey(), entry.getValue().toString());
            }
        }

        try (Response response = client.newCall(requestBuilder.build()).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}