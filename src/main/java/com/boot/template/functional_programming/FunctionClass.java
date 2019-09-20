package com.boot.template.functional_programming;

/**
 * @author: shangshanshan
 * @date: 2019-8-13 20:29
 * @Description: TODO
 */
public class FunctionClass {

    private String name;

    private int age;

    //构造方法
    public FunctionClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name" + name + "---" + "age" + age;
    }

    //构造方法
    public FunctionClass() {
    }

    //静态方法
    public static String chang(int i){

        return String.valueOf(i);
    }

    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
