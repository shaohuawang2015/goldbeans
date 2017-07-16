package com.limo.goldbeans.utils;


import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.util.JSONPObject;

import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by shaohua.wsh on 2017/7/10.
 */
public class HttpClientUtil {

    private final static Logger logger = Logger.getLogger(HttpClientUtil.class);

    public static JSONObject httpGet(String url) {
        JSONObject jsonResult = null;
        try {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String result = EntityUtils.toString(response.getEntity());
                jsonResult = JSONObject.parseObject(result);
                url = URLDecoder.decode(url, "UTF-8");
            } else {
                logger.info("get request error." + url);
            }
        } catch (IOException e) {
            logger.error("httpclient request error.", e);
        }
        return jsonResult;
    }

}
