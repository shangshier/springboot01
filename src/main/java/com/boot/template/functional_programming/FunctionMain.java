package com.boot.template.functional_programming;

/**
 * @author: shangshanshan
 * @date: 2019-8-13 20:58
 * @Description: TODO
 */
public class FunctionMain {

    public static void main(String[] args) {

        //需要注意的是函数式接口中的方法有没有返回值与参数 如果存在指向的方法必须也要有这些东西(返回值与参数)
        //还有就是函数式接口中的抽象方法的参数与返回值最好使用泛型来表示因为你指向的方法有可能存在重载的可能
        //这个时候指向的方法就不确定调用的是哪个方法了

        //1.引用静态方法: 类名称 :: static方法名称
//        IFunction<Integer> fun = FunctionClass :: chang;
//        String str = fun.send(100);
//        System.out.println(str);

        //2.引用某个实例对象的方法: 实例化对象 :: 普通方法
//        FunctionClass functionClass = new FunctionClass();
//        IFunction<String> fun = functionClass :: toUpperCase;
//        System.out.println(fun.send("shang.shan.shan"));

        //3.引用特定类型的方法: 特定类 :: 普通方法
        //String类做测试
//        IFunction<String> fun = String :: compareTo;
//        System.out.println(fun.compareToStr("A","a"));

        //4.引用构造方法: 类名称 :: new
        IFunction<FunctionClass> fun = FunctionClass :: new;
        System.out.println(fun.create("上山", 27));
    }
}
