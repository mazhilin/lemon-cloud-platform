package com.lemon.cloud.core.restful;

import com.lemon.cloud.core.serializer.ObjectSerializer;
import com.lemon.cloud.core.utils.LoggerServerUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/** @author marklin */
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class Response implements ObjectSerializer {
  private static final long serialVersionUID = 716757939884650045L;
  /** 状态编码 */
  private Integer code;
  /** 消息描述 */
  private String message;

  /** 消息描述 */
  private Boolean status;

  /** 数据实体 */
  private Object data;

  /**
   * 构建结果
   *
   * @param code 状态编码
   * @param message 消息描述
   * @param status 消息描述
   * @param data 数据实体
   * @param <T> 数据实体
   * @return 返回结果
   */
  protected static <T> Response builderResult(int code, String message, boolean status, T data) {
    Response response = new Response();
    response.setCode(code);
    response.setMessage(message);
    response.setStatus(status);
    response.setData(data);
    return response;
  }

  public static Response success() {
    return builderResult(200, "请求成功!", Boolean.TRUE, null);
  }

  /**
   * 请求成功
   *
   * @param data 数据实体
   * @param <T> 数据实体
   * @return 返回结果
   */
  public static <T> Response success(T data) {
    return builderResult(200, "请求成功!", Boolean.TRUE, data);
  }

  /**
   * 请求成功
   *
   * @param data 数据实体
   * @param message 消息
   * @param <T> 数据实体
   * @return 返回结果
   */
  public static <T> Response success(T data, String message) {
    return builderResult(200, message, Boolean.TRUE, data);
  }

  /**
   * 请求成功 请求失败
   * @return 返回结果
   */
  public static Response failure() {
    return builderResult(500, "请求失败!", Boolean.FALSE, null);
  }

  /**
   * 请求失败
   *
   * @param message 消息
   * @param <T> 数据实体
   * @return 返回结果
   */
  public static <T> Response failure(String message) {
    return builderResult(500, message, Boolean.FALSE, null);
  }

  /**
   * 请求失败
   *
   * @param data 数据实体
   * @param <T> 数据实体
   * @return 返回结果
   */
  public static <T> Response failure(T data) {
    return builderResult(500, "请求失败!", Boolean.FALSE, data);
  }

  /**
   * 请求失败
   *
   * @param message 消息
   * @param data 数据实体
   * @param <T> 数据实体
   * @return 返回结果
   */
  public static <T> Response failure(String message, T data) {
    return builderResult(500, message, Boolean.FALSE, data);
  }

  /**
   * 请求失败
   *
   * @param code 编码
   * @param message 消息
   * @return 返回结果
   */
  public static Response failure(int code, String message) {
    return builderResult(code, message, Boolean.FALSE, null);
  }

  public static void main(String[] args){
    System.out.println(Response.failure());
  }

}
