package com.halen.springframework.beans.factory.config;

/**
 * Created By Halen 2021/8/15 23:52
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
