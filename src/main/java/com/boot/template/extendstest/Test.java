package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-8-9 11:10
 * @Description: TODO
 */
public class Test {

    public static void main(String[] args) {
        A a2 = new B();
        B b = new B();
        System.out.println(a2.show(b));
    }
}
