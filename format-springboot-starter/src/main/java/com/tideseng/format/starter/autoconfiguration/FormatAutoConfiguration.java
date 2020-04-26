package com.tideseng.format.starter.autoconfiguration;

import com.tideseng.format.starter.FormatTemplate;
import com.tideseng.format.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 注解配置类
 */
@Import(FormatConfiguration.class)
@EnableConfigurationProperties(FormatProperties.class)
@Configuration
public class FormatAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatProperties formatProperties, FormatProcessor formatProcessor){
        return new FormatTemplate(formatProperties, formatProcessor);
    }
}