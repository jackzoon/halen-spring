package com.halen.springframework.beans.factory.support;

import com.halen.springframework.beans.BeansException;
import com.halen.springframework.beans.factory.BeanFactory;
import com.halen.springframework.beans.factory.config.BeanDefinition;

/**
 * Created By Halen 2021/8/15 23:58
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
