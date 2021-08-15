package com.halen.springframework.test;

import com.halen.springframework.BeanDefinition;
import com.halen.springframework.BeanFactory;
import com.halen.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * Created By Halen 2021/8/15 23:22
 */
public class ApiTest {

    @Test
    public void test_beanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
