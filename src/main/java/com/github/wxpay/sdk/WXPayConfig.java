package com.github.wxpay.sdk;

import java.io.InputStream;

public interface WXPayConfig {


    /**
     * 获取 App ID
     *
     * @return App ID
     */
    public String getAppID();


    /**
     * 获取 Mch ID
     *
     * @return Mch ID
     */
    public String getMchID();


    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
    public String getKey();


    /**
     * 获取商户证书内容
     *
     * @return 商户证书内容
     */
    public InputStream getCertStream();

     /**
     * 获取支付方式
     *
     * @return 支付方式
     */
    String getTradeType();

    /**
     * 获取签名方式
     *
     * @return 签名方式
     */
    String getSignType();

    /**
     * 获取回调地址
     *
     * @return 回调地址
     */
    String getNotifyUrl();

    /**
     * 获取微信支付分配的商户号
     *
     * @return 商户号
     */
    String getPartnerId();


    /**
     * HTTP(S) 连接超时时间，单位毫秒
     *
     * @return
     */
    public int getHttpConnectTimeoutMs();

    /**
     * HTTP(S) 读数据超时时间，单位毫秒
     *
     * @return
     */
    public int getHttpReadTimeoutMs();

}
