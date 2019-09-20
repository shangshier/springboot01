package com.boot.template.extendstest;

import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-6-24 10:37
 * @Description: TODO
 */
@Component
public class MoreClass extends AbstractClass implements InterfaceClass {
    @Override
    public void getStr() {
        System.out.println("abstract方法");
    }

    @Override
    public void get() {
        System.out.println("interface方法");
    }


}
