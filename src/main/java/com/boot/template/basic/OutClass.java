package com.boot.template.basic;

/**
 * @author: shangshanshan
 * @date: 2019-8-22 17:49
 * @Description: 内部类
 */
public class OutClass {

    private String name;

    private Integer age;

    static final String SEX = "男";

    private void outPrivateFun() {
        System.out.println("外部类私有方法");
    }

    public void outPublicFun() {
        System.out.println("外部类Public方法");
    }

    private static void outStaticFun() {
        System.out.println("外部类static-private方法");
    }

    public static void outStaticPubFun() {
        System.out.println("外部类static-private方法");
    }


    public static class InnerClass {
        public InnerClass() {

        }
        //内部类不为static类时不能创建静态方法
        private static void innerStaticPubFun(){
            System.out.println("内部类的静态方法");
        }
        public void innerClassFun() {
            outStaticFun();
            outStaticPubFun();
            OutClass.outStaticPubFun();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
//        普通内部类定义
//        OutClass.InnerClass innerClass = new OutClass().new InnerClass();
//        静态内部类定义
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
        innerClass.innerClassFun();
    }
}
