package com.tideseng.springbootquick._3_componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示@SpringBootApplication中@ComponentScan注解的作用
 */
public class ComponentScanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        UserServiceImpl userService = applicationContext.getBean(UserServiceImpl.class); // DL查找
        System.out.println(userService.getName());

        // 打印容器中的Bean对象
        String[] defNames = applicationContext.getBeanDefinitionNames();
        for(int i=0; i<defNames.length; i++){
            System.out.println(defNames[i]);
        }
    }

}