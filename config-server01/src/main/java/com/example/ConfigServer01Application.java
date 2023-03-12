package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// 配置中心服务端注解
@EnableConfigServer
@SpringBootApplication
public class ConfigServer01Application {

  public static void main(String[] args) {
    SpringApplication.run(ConfigServer01Application.class, args);
  }

}
