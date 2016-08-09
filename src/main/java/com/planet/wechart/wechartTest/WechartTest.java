package com.planet.wechart.wechartTest;

import com.planet.wechart.util.CommonUtil;
import com.planet.wechart.util.WechartConf;
import com.planet.wechart.vo.WechartUserInfo;

/**
 * Created by wanwan on 16/8/9.
 */
public class WechartTest {
    public static void main(String args[]){
        // 获取接口访问凭证
        String accessToken = CommonUtil.getToken(WechartConf.APPID, WechartConf.APPSECRET).getAccessToken();
        /**
         * 获取用户信息  这里的openId 写死
         */
        WechartUserInfo user = CommonUtil.getUserInfo(accessToken, "oTM6cwbVynTPJmZG40Y9pnxBpurA");
        System.out.println("OpenID：" + user.getOpenId());
        System.out.println("关注状态：" + user.getSubscribe());
        System.out.println("关注时间：" + user.getSubscribeTime());
        System.out.println("昵称：" + user.getNickname());
        System.out.println("性别：" + user.getSex());
        System.out.println("国家：" + user.getCountry());
        System.out.println("省份：" + user.getProvince());
        System.out.println("城市：" + user.getCity());
        System.out.println("语言：" + user.getLanguage());
        System.out.println("头像：" + user.getHeadImgUrl());
    }

}
