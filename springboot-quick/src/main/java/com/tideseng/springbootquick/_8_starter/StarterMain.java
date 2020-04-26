package com.tideseng.springbootquick._8_starter;

import com.tideseng.format.starter.FormatTemplate;
import com.tideseng.springbootquick.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses=User.class) // 引入其它包下的User类
@SpringBootApplication
public class StarterMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StarterMain.class, args);
        FormatTemplate formatTemplate = applicationContext.getBean(FormatTemplate.class);
        User user = applicationContext.getBean(User.class);
        System.out.println(formatTemplate.doFormat(user));
    }

}
