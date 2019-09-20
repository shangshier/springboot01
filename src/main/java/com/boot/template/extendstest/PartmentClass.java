package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-6-21 10:47
 * @Description: TODO
 */
public class PartmentClass extends GrandParmentClass{

    private String name;

    private String age;

    public PartmentClass() {
    }

    public PartmentClass(String name, String age) {
        super(name,age);
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
