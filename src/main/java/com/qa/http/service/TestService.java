package com.qa.http.service;

import com.qa.common.HttpUtils;
import com.qa.common.InitEnv;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名与接口对应的开发类一致，针对开发的http接口进行封装
 */
public class TestService extends InitEnv {
    HttpUtils httpUtils = new HttpUtils();

    public String getById(String mediaId,String cookie){
        String url = properties.getProperty("host")+"/api/mgc/media/video/detail/getById";
        Map<String,String> params = new HashMap<String, String>();
        params.put("mediaId",mediaId);
        params.put("_t",String.valueOf(System.currentTimeMillis()));

        Map<String,String> headers = new HashMap<String, String>();
        headers.put("Cookie",cookie);

        return httpUtils.doGet(url,params,headers);
    }
}
