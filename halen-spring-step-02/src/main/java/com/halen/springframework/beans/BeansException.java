package com.halen.springframework.beans;

/**
 * Created By Halen 2021/8/15 23:48
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
