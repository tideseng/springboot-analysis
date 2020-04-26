package com.tideseng.springbootquick._5_enableautoconfiguration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 模仿@EnableAutoConfiguration注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class,LoggerImportRegistrar.class})
public @interface EnableAutoConfig {

    Class<?>[] exclude() default {};

}