package com.boot.template.functional_programming;

/**
 * @author: shangshanshan
 * @date: 2019-8-12 21:43
 * @Description: TODO
 */
@FunctionalInterface
public interface FunctionalProgramming {

    //lambda表达式如果想要使用,那么必须有一个重要的实现要求SAM(Single Abstract Methed),就是接口中就只有一个抽象方法不存在多个抽象方法
    //只有一个抽象方法(但是可以存在default、static方法)的接口就被称为是函数式接口，而只有函数式接口才能被lambda表达式所使用

    //对于lambda表达式而言提供了如下几种格式
    // 1.方法中没有参数: () -> {};
    // 2.方法中有参数: (参数,参数) -> {};
    // 3.如果只有一行语句返回: (参数,参数) -> 语句;

    //1.方法中没有参数: () -> {};
//    void send();

    // 2.方法中有参数: (参数,参数) -> {};
//    String send(String str1,String str2);

//    // 3.如果只有一行语句返回: (参数,参数) -> 语句;
    int math(int x, int y);

    //函数式接口中可以存在default普通方法、static静态方法
    //JDk1.8提出的接口中可以存在default普通方法、static静态方法就是为了lambda所准备的

    //普通方法--再次强调一下:接口中可以存在普通方法但是必须使用default关键字修饰
    default void defaultFun(){
        System.out.println("函数式接口中可以存在default普通方法");
        System.out.println("调用一下接口中的常量试一下-------" + STR);
    }
    //静态方法
    static void staticFun(){
        System.out.println("函数式接口中可以存在static方法");
    }

    //函数式接口中也可以存在常量 -- 注:接口中的属性都是默认的使用public static final修饰的常量
    //注意:java中常量最好使用大写
    String STR = "静态常量";
}
