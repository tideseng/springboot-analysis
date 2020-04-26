package com.tideseng.springbootquick._5_enableautoconfiguration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 实现ImportSelector接口进行动态注入，根据条件指定注入的对象
 * 这里是简单模拟，将动态注入的条件写死，实际上Spring Boot是通过读取配置文件来动态注入
 *
 * Spring Boot动态注入原理
 *  1.读取META-INF/spring-autoconfigure-metadata.properties配置文件(用于条件过滤bean)
 *  2.读取META-INF/spring.factories配置文件(用于注入bean，类似于SPI扩展点机制)
 *  3.删除spring.factories配置文件中重复的beanName(多个项目可能存在多个spring.factories配置文件)
 *  4.从spring.factories配置文件中exclude排除程序指定的bean
 *  5.从spring.factories配置文件中过滤不符合spring-autoconfigure-metadata.properties条件的bean
 */
public class CacheImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableAutoConfig.class.getName());
        Class<?>[] excludes = (Class<?>[]) attributes.get("exclude");
        List<Class<?>> classes = Arrays.asList(excludes);
        if(classes.contains(CacheServiceImpl.class))
            return new String[0];

        return new String[]{CacheServiceImpl.class.getName()};
    }

}
