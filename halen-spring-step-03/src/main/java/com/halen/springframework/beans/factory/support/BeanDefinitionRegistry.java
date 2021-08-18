package com.halen.springframework.beans.factory.support;

import com.halen.springframework.beans.factory.config.BeanDefinition;

/**
 * Created By Halen 2021/8/16 21:48
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
