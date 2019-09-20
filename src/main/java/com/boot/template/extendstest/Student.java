package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-6-27 21:18
 * @Description: 子类
 */
public class Student extends Person{

    public Student() {
    }

    public Student(String name, Integer age) {
        super(name, age);
    }


    public static String sonPubStr = "str";

    protected static String sonProStr = "proStr";

    private static String sonPriStr = "priStr";

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public void pubSonFun(){
        System.out.println("子类公共方法");
    }

    private void priSonFun(){
        System.out.println("子类私有方法");
    }

    protected void proSonFun(){
        System.out.println("子类受保护的方法");
    }

    private static void priSonStFun(){
        System.out.println("子类私有静态方法");
    }

    protected static void proSonStFun(){
        System.out.println("子类受保护的静态方法");
    }

    public static void pubSonStFun(){
        System.out.println("子类公共的静态方法");
    }

    @Override
    public void pubFun() {
        System.out.println("子类方法重写");
    }

}
