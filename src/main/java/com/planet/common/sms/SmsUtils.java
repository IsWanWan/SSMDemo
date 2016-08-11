package com.planet.common.sms;

import com.cloopen.rest.sdk.CCPRestSDK;

import java.util.HashMap;
import java.util.Map;


public class SmsUtils {

    public static Map sendMessage(String mobile, int template, String[] values) {
        HashMap result = null;
        CCPRestSDK restAPI = new CCPRestSDK();
        restAPI.init("app.cloopen.com", "8883");
        // 初始化服务器地址和端口，沙盒环境配置成sandboxapp.cloopen.com，生产环境配置成app.cloopen.com，端口都是8883.
        restAPI.setAccount("aaf98f895427cf5001542c8d3ee806e4", "9b6a5400be8149808243354c8a17366a");
        // 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在"控制台-应用"中看到开发者主账号ACCOUNT SID和
        //主账号令牌AUTH TOKEN。
        restAPI.setAppId("aaf98f8954939ed50154db6edc134445");
        // 初始化应用ID，如果是在沙盒环境开发，请配置"控制台-应用-测试DEMO"中的APPID。
        //如切换到生产环境，请使用自己创建应用的APPID
        result = restAPI.sendTemplateSMS(mobile, "" + template, values);
        System.out.println("SDKTestGetSubAccounts result=" + result);
        return result;
    }

//    public static Map sendMessage() {
//
//        return sendMessage("13816277368,15800387252,15258451118", 88315, null);
//    }



}

