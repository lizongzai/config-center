package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述: 配置中心
 *
 * @author lizongzai
 * @date 2023/03/12 18:38
 * @since 1.0.0
 */
@RefreshScope
@RestController
public class ConfigController {

  @Value("${name}")
  private String name;
  @Value("${password}")
  private String password;

  @GetMapping("/name")
  public String getName() {
    return name;
  }

  /**
   * 获取解密后的密码
   *
   * @return
   */
  @GetMapping("/password")
  public String getPassword() {
    return password;
  }

}
