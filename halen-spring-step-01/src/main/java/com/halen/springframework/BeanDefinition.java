package com.halen.springframework;

/**
 * Created By Halen 2021/8/15 23:18
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
