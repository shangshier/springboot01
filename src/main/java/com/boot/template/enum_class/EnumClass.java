package com.boot.template.enum_class;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:55
 * @Description: TODO
 */
public enum EnumClass {

    RED,GREEN,BLUE;

    EnumClass() {
    }

    private static final String STR = "love";

    public static void staticFun(){
        System.out.println("枚举类中的static方法");
    }
}
