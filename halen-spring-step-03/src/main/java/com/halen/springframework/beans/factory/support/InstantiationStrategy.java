package com.halen.springframework.beans.factory.support;

import com.halen.springframework.beans.factory.BeansException;
import com.halen.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Created By Halen 2021/8/16 22:03
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
