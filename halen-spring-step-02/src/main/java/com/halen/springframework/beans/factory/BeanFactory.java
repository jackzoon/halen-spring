package com.halen.springframework.beans.factory;

import com.halen.springframework.beans.BeansException;

/**
 * Created By Halen 2021/8/15 23:52
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
