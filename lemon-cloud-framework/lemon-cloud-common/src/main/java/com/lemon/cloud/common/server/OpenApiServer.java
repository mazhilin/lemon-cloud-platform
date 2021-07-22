package com.lemon.cloud.common.server;

/** @author marklin */
public interface OpenApiServer extends Server{

  /**
   * 授权API的Token服务
   *
   * @param appId 应用ID
   * @param appSecret 应用密钥
   * @param grantType 授权类型
   * @param enabled 是否
   * @return 返回结果
   * @throws Exception 异常消息
   */
  String authorizeApiToken(String appId, String appSecret, String grantType, boolean enabled)
      throws Exception;

  /**
   * 调用接口API的服务
   *
   * @param apiAddress API地址
   * @param requestParams 请求参数
   * @param requestMethod 请求方法
   * @param authorizeTarget 授权标识别
   * @param authorizeToken 授权API的Token
   * @return 返回结果
   * @throws Exception 异常消息
   */
  String invokerApiService(
      String apiAddress,
      String requestParams,
      String requestMethod,
      String authorizeTarget,
      String authorizeToken)
      throws Exception;
}
