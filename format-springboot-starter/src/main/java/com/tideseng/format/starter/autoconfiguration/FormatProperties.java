package com.tideseng.format.starter.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * 自定义starter的属性
 */
@ConfigurationProperties(prefix=FormatProperties.FORMAT_PREFIX)
public class FormatProperties {

    public static final String FORMAT_PREFIX="com.tideseng.format";
    private Map<String,Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}