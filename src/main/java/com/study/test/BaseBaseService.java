package com.study.test;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseBaseService {
    private AServiceImpl as;

    public void sayHello() {
        System.out.println("Base Base Service says hello");
    }
}
