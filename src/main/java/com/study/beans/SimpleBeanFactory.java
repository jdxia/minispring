package com.study.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleBeanFactory implements BeanFactory {

    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private List<String> beanNames = new ArrayList<>();
    private Map<String, Object> singletons = new HashMap<>();

    public SimpleBeanFactory() {
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        //先尝试直接拿bean实例
        Object singleton = singletons.get(beanName);
        //如果此时还没有这个bean的实例, 获取他的定义来创建实例
        if (singleton == null) {
            int i = beanNames.indexOf(beanName);
            if (i == -1) {
                throw new BeansException("bean的定义都没有");
            } else {
                //获取bean的定义
                BeanDefinition beanDefinition = beanDefinitions.get(i);
                try {
                    singleton = Class.forName(beanDefinition.getClassName()).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //注册bean实例
                singletons.put(beanDefinition.getId(), singleton);
            }
        }

        return singleton;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanDefinitions.add(beanDefinition);
        this.beanNames.add(beanDefinition.getId());
    }
}
