package com.tideseng.springbootquick._7_springfactories;

import com.tideseng.springfactories.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 演示spring.factories、spring-autoconfigure-metadata.properties配置文件作用
 * 原理分析：
 *  该项目中引入了自定义springboot-spring-factories项目依赖
 *  springboot-spring-factories项目中有META-INF/spring.factories配置文件
 *  spring.factories配置文件中存在key: org.springframework.boot.autoconfigure.EnableAutoConfiguration，value为注解配置类
 *  @SpringBootApplication的@EnableAutoConfiguration注解中导入了AutoConfigurationImportSelector类（实现了ImportSelector接口）
 *  AutoConfigurationImportSelector类会加载spring.factories配置文件中org.springframework.boot.autoconfigure.EnableAutoConfiguration的beanName
 *  当没有META-INF/spring-autoconfigure-metadata.properties配置文件时（即springboot-spring-factories项目没有spring-autoconfigure-metadata.properties）
 *      springboot-spring-factories项目的注解配置类等开始注入容器
 *  当存在META-INF/spring-autoconfigure-metadata.properties配置文件时（即springboot-spring-factories项目存在spring-autoconfigure-metadata.properties）
 *      先判断条件是否满足（springboot-spring-factories项目的spring-autoconfigure-metadata.properties定义的条件是当前目录下要存在Jiahuan类才注入）
 *      条件满足后springboot-spring-factories项目的注解配置类等开始注入容器（当前类下以存在Jiahuan类，所以会出现打印信息；如果将Jiahuan删除或改名，则不会出现打印信息）
 */
@SpringBootApplication
public class SpringFactoriesMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringFactoriesMain.class, args);

        try{
            System.out.println("UserServiceImpl--> " + applicationContext.getBean(UserServiceImpl.class));
        } catch(Exception e){
        }
    }
}
