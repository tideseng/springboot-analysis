package com.tideseng.springbootquick._4_imports;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 导入作用之一是导入注解配置类，将对象托管到IOC容器
 * 导入作用之二是导入ImportSelector实现类，通过条件动态注入将对象托管到ICO容器
 * 导入作用之三是导入ImportBeanDefinitionRegistrar实现类，通过条件动态注入将对象托管到ICO容器
 */
@Import(com.tideseng.springbootquick._2_configuration.ApplicationConfiguration.class)
@ComponentScan("com.tideseng.springbootquick._4_imports")
public class ApplicationConfiguration {

}
