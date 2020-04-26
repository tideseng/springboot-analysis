package com.tideseng.springbootquick;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 将配置文件中的属性封装为对象
 */
@ConfigurationProperties(prefix = "user")
public class User {

    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}