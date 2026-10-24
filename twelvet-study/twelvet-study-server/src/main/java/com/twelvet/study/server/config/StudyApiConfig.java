package com.twelvet.study.server.config;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自习室小程序接口配置
 *
 * <p>
 * 通过 {@code @ForestScan} 声明接口所在包，由 Forest 自动配置扫描并注册为 Bean， 无需手工创建客户端实例。
 *
 * @author twelvet
 * @WebSite twelvet.cn
 */
@Configuration(proxyBeanMethods = false)
@ForestScan(basePackages = "com.twelvet.study.server.client")
public class StudyApiConfig {

}
