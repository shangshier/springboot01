package com.boot.template.basic;

/**
 * @author: shangshanshan
 * @date: 2019-8-22 20:36
 * @Description: 匿名内部类
 */
public class AnonymousInnerClass {

    public void fun(AnonymousInterface face) {
        face.print();
    }

    public static void main(String[] args) {
        AnonymousInnerClass innerClass = new AnonymousInnerClass();
        innerClass.fun(new AnonymousInterface() {
            @Override
            public void print() {
                System.out.println("123");
            }

            @Override
            public String created() {
                return null;
            }
        });
    }
}
