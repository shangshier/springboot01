package com.boot.template.functional_programming;

/**
 * @author: shangshanshan
 * @date: 2019-8-13 20:22
 * @Description: 函数式编程 -- 方法引用
 */
@FunctionalInterface
public interface IFunction<P> {

    //从JDK1.8以后提供了方法的引用,即不同的方法名称可以描述同一个方法
    //方法引用在java中提供了4种方式
    //1.引用静态方法: 类名称 :: static方法名称
    //2.引用某个实例对象的方法: 实例化对象 :: 普通方法
    //3.引用特定类型的方法: 特定类 :: 普通方法
    //4.引用构造方法: 类名称 :: new


    //1.引用静态方法: 类名称 :: static方法名称
//    String send(P p);

    //2.引用某个实例对象的方法: 实例化对象 :: 普通方法
//    String send(P p);

    //3.引用特定类型的方法: 特定类 :: 普通方法
//    int compareToStr(P p1, P p2);

    //4.引用构造方法: 类名称 :: new
    P create(String str, int i);
}
