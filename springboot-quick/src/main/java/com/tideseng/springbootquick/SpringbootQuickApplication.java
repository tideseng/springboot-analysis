package com.tideseng.springbootquick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication复合注解（实现自动装配）
 *  @SpringBootConfiguration
 *      其实就是@Configuration，声明为注解配置类，本质上是将对象托管到IOC容器
 *  @ComponentScan
 *      包扫描注解，扫描当前包及其子包，本质上也是将对象托管到IOC容器
 *  @EnableAutoConfiguration复合注解（其实就是导入了两个类，进行条件动态注入，将对象托管到IOC容器）
 *      @AutoConfigurationPackage
 *          @Import({AutoConfigurationPackages.Registrar.class})
 *              ImportBeanDefinitionRegistrar实现类
 *                  1.读取META-INF/spring-autoconfigure-metadata.properties配置文件(用于条件过滤bean，避免注入不必要的类)
 *                  2.读取META-INF/spring.factories配置文件(用于注入bean，类似于SPI扩展点机制)
 *                  3.删除spring.factories配置文件中重复的beanName(多个项目可能存在多个spring.factories配置文件)
 *                  4.从spring.factories配置文件中exclude排除程序指定的bean
 *                  5.从spring.factories配置文件中过滤不符合spring-autoconfigure-metadata.properties条件的bean
 *      @Import({AutoConfigurationImportSelector.class})
 *          ImportSelector实现类
 * ps：
 *  External Libraries下的org.springframework.boot:spring-boot-autoconfigure下的META-INF目录下，可查看spring.factories、spring-autoconfigure-metadata.properties配置文件
 */
@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class SpringbootQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickApplication.class, args);
    }

}
