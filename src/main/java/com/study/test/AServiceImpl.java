package com.study.test;

import lombok.Data;

@Data
public class AServiceImpl implements AService {

    private String name;
    private int level;
    private String property1;
    private String property2;

    private BaseService ref1;

    public AServiceImpl(String name, int level) {
        this.name = name;
        this.level = level;
        System.out.println(this.name + "," + this.level);
    }

    //    private String property1;
//
//    public String getProperty1() {
//        return property1;
//    }
//
//    public void setProperty1(String property1) {
//        this.property1 = property1;
//    }

    @Override
    public void sayHello() {
        System.out.println(this.property1 + "," + this.property2);
    }
}
