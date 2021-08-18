package com.halen.springframework.beans.factory.config;

/**
 * Created By Halen 2021/8/17 9:00
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
