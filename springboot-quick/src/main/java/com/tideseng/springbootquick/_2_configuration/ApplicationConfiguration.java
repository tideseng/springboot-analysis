package com.tideseng.springbootquick._2_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解配置类，本质上是通过注解将对象托管到IOC容器
 */
@Configuration
public class ApplicationConfiguration {

    /**
     * 将对象注入容器，默认单例，默认id为方法名
     *  这里模拟一个对象，实际应用中应该是读取配置类生成对象
     * @return
     */
    @Bean("useService1")
    public UserServiceImpl userService(){
        return new UserServiceImpl();
    }

}
