package com.halen.springframework.beans.factory.support;

import com.halen.springframework.beans.BeansException;
import com.halen.springframework.beans.factory.config.BeanDefinition;

/**
 * Created By Halen 2021/8/16 0:07
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
