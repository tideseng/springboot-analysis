package com.tideseng.springbootquick._5_enableautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 演示@EnableAutoConfiguration注解的作用，自定义动态注入bean
 */
@EnableAutoConfig(exclude = {CacheServiceImpl.class})
@SpringBootApplication
public class EnableAutoConfigurationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EnableAutoConfigurationMain.class, args);

        try{
            System.out.println("CacheServiceImpl--> " + applicationContext.getBean(CacheServiceImpl.class));
        } catch(Exception e){
        }
        try{
            System.out.println("LoggerServiceImpl--> " + applicationContext.getBean(LoggerServiceImpl.class));
        } catch(Exception e){
        }
    }

}
