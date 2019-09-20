package com.boot.template.functional_programming;

/**
 * @author: shangshanshan
 * @date: 2019-8-12 21:57
 * @Description: TODO
 */
public class FunctionalProgrammingMain {

    public static void main(String[] args) {
        //对于lambda表达式而言提供了如下几种格式
        // 1.方法中没有参数: () -> {};
//        FunctionalProgramming programming = () -> {
//            System.out.println("函数式接口方法中没有参数");
//        };
//        programming.send();

        // 2.方法中有参数: (参数,参数) -> {};
//        FunctionalProgramming programming = (str1,str2) -> {
//            String str = str1 + "+" + str2;
//            return str;
//        };
//
//        System.out.println(programming.send("张三","23"));

        // 3.如果只有一行语句返回: (参数,参数) -> 语句;
        FunctionalProgramming programming = (x,y) -> x + y;

        System.out.println(programming.math(10,20));
        //也可以调用接口中的default默认方法
        programming.defaultFun();
        //如上:此时只有一行返回值:return x + y; 是可以直接去掉return和{}的

    }
}
