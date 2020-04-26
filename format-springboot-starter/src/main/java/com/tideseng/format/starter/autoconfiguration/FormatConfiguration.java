package com.tideseng.format.starter.autoconfiguration;

import com.tideseng.format.starter.format.FormatProcessor;
import com.tideseng.format.starter.format.JsonFormatProcessor;
import com.tideseng.format.starter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * 动态注入，当依赖的项目中存在fastjson依赖时用json格式化，否则用string格式化
 */
public class FormatConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON") // 指定类不存在时注入
    @Bean
    @Primary
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON") // 指定类存在时注入
    @Bean
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor();
    }

}
