package com.boot.template;

/**
 * @author: shangshanshan
 * @date: 2019-4-9 20:52
 * @Description: TODO
 */
public class ParentClass {

    public ParentClass() {

        System.out.println("父类----");
    }



    protected void parentMonthed(){
        System.out.println("父类方法");
    }

    public void publicFunction(){
        System.out.println("父类");
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
