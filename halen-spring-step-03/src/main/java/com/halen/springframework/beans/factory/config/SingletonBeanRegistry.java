package com.halen.springframework.beans.factory.config;

/**
 * Created By Halen 2021/8/16 21:47
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
