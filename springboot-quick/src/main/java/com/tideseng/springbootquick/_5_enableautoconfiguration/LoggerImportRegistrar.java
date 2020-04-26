package com.tideseng.springbootquick._5_enableautoconfiguration;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 实现ImportBeanDefinitionRegistrar接口进行动态注入，根据条件指定注入的对象
 */
public class LoggerImportRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableAutoConfig.class.getName());
        Class<?>[] excludes = (Class<?>[]) attributes.get("exclude"); // 根据exclude属性值排除指定的对象
        List<Class<?>> classes = Arrays.asList(excludes);
        if(classes.contains(LoggerServiceImpl.class))
            return;

        Class beanClass = LoggerServiceImpl.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanClass);
        String beanName = StringUtils.uncapitalize(beanClass.getSimpleName());
        beanDefinitionRegistry.registerBeanDefinition(beanName, beanDefinition);
    }

}
