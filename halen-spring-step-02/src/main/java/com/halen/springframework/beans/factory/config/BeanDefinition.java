package com.halen.springframework.beans.factory.config;

/**
 * Created By Halen 2021/8/15 23:49
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass() {
        this.beanClass = beanClass;
    }
}
