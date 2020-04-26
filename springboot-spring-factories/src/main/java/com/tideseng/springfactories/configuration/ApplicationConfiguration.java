package com.tideseng.springfactories.configuration;

import com.tideseng.springfactories.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public UserServiceImpl userService(){
        return new UserServiceImpl();
    }

}
