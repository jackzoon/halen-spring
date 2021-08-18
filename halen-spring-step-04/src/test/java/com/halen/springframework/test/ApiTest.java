package com.halen.springframework.test;

import com.halen.springframework.beans.PropertyValue;
import com.halen.springframework.beans.PropertyValues;
import com.halen.springframework.beans.factory.config.BeanDefinition;
import com.halen.springframework.beans.factory.config.BeanReference;
import com.halen.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.halen.springframework.test.bean.UserDao;
import com.halen.springframework.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created By Halen 2021/8/16 22:43
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
