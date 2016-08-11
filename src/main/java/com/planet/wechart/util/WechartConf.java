package com.planet.wechart.util;

/**
 * Created by wanwan on 16/8/9.
 */
public class WechartConf {
    //公众号APPID
    public static String APPID = "wx5b810eb895af8699";

    //公众号APPSECRET
    public static String APPSECRET = "67000592380224606e15b062adbbfb87";

    //微信服务器Token
    public static String TOKEN = "zmmusic";

    //商户ID
    public static String MCHID = "1335477401";

    //商户支付密钥Key。审核通过后，在微信发送的邮件中查看
    public static String KEY = "zhimayinyuesupergeeks20160512lgs";

    //异步回调地址
    public static String NOTIFY_URL = "http://www.zhimayinyue.com/WeChatPay/pay-notify";


    //微信统一下单接口
    public static String unifiedorder = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    //微信支付页面url
    public static String url = "http://www.zhimayinyue.com/mobile/index";
    // public static String url = "http://fortest.tunnel.qydev.com/WeChatPay/payConf";

    //微信jspai_ticket
    public static String jsapi_ticket = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";
    //获取openId
    public static String oauth_url = "https://api.weixin.qq.com/sns/oauth/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    // 根据openId 获得用户信息
    String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
    // 凭证获取（GET）获取 accesstoken
    public final static String token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    //获取用户授权 返回一个code  redirect_uri 重定向地址 snsapi_base:不弹出授权页面，直接跳转，
    // 只能获取用户openid snsapi_userinfo:弹出授权页面，可通过openid拿到昵称、性别、所在;
   private final static String codeUrl ="https://open.weixin.qq.com/connect/oauth/authorize?appid=appid&redirect_uri=url" +
           "&response_type=code&scope=snsapi_userinfo&state=park#wechat_redirect";
}
