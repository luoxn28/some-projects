package com.luo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * SpringConfig
 */
@Configuration
@ComponentScan("com.luo.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
