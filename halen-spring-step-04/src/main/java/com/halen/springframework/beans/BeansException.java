package com.halen.springframework.beans;

/**
 * Created By Halen 2021/8/16 21:43
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
