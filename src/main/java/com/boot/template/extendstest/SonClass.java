package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-6-21 10:48
 * @Description: TODO
 */
public class SonClass extends PartmentClass {

    private String number;

    private String sex;

    public SonClass(String name, String age) {
        super(name, age);
    }

    public SonClass() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
