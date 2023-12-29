package com.study.test;

import com.study.beans.BeansException;
import com.study.context.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aservice = (AService) ctx.getBean("aservice");
        aservice.sayHello();
    }
}
