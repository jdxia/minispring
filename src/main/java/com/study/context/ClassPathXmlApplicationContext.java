package com.study.context;

import com.study.beans.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.study.core.ClassPathXmlResource;
import com.study.core.Resource;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ClassPathXmlApplicationContext implements BeanFactory {
    BeanFactory beanFactory;

    //构造器获取外部配置, 解析出bean的定义, 形成内存映像
    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
        BeanFactory beanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        this.beanFactory = beanFactory;
    }

    public Object getBean(String beanName) throws BeansException {
        return this.beanFactory.getBean(beanName);
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanFactory.registerBeanDefinition(beanDefinition);
    }

}
