package com.boot.template.inteface;

/**
 * @author: shangshanshan
 * @date: 2019-7-20 15:29
 * @Description: 第一个接口
 */
public interface IOneInterface extends ICannel,PersonInterface {
    @Override
    void cannel();

//    @Override
//    default void msgs() {
//
//    }


    @Override
    default void msgs() {

    }

    @Override
    default void msgs(String msg) {

    }


    //    1.接口中无法定义成员变量,但是可以定义常量,其值不可以改变,默认使用public static final修饰
//
//　　2.接口中,没有构造方法,不能创建对象
//
//　　3.接口中,没有静态代码块
//
//　　4.可以继承,可以重写,二选一,但是只能通过实现类的对象来调用
//
//　　5.接口可以多实现
//
//　　6.默认方法和静态方法JDK8版本才出的.
//
//　　7.接口中抽象方法使用abstract关键字修饰,可以省略,没有方法体,该方法供子类实现使用.
//
//　　8.静态与.class文件相关,只能使用接口名调用,不可以通过实现类的类名或者实现类的对象调用
//
//　　9. 一个接口能继承另外一个或者多个接口,这和类之间的继承比较相似,接口的继承使用extends关键字,子接口继承父接口的方法.如果父接口中的默认方法有重名的,那么子接口需要重写一次

    //接口中的常量都是public static所修饰的 可以通过接口+ . + 变量名称直接调用
    //所有接口中的常量修饰是可以直接省略public static的
    //接口中也可以存在public static final
    //例:
    public static final String str = "ASDJKJJJJJJJJJKSJLAD";
    public static String strs = null;
    String msg = "asdhkjhak";

    String bac = null;

    //由于JDK1.8以后增加了lambda表达式所以接口中是可以定义普通方法与静态方法的
    //因为接口是通过子类实例化的所以接口中的所有方法都是public
    //由于接口是在jdk1.8之后可以定义普通方法的所以在接口定义普通方法时必须要加上关键字"default"
    //例:
    default void msg(){
        System.out.println("接口定义的普通方法,注意必须要使用关键字'default' ");
    }

    default void msg(String id){

    }
    //接口中定义static方法,接口中的静态方法是可以直接通过接口名称+方法名直接调用的,这个和接口的静态常量是一样的
    //接口中的静态方法也必须使用public修饰
    //例:
    static void stcFun(){
        System.out.println("接口中定义的静态方法");
    }

    //接口的抽象方法
    //由于接口中的抽象方法都是由public abstract修饰的所有接口中的所有抽方法都可以省略public abstract关键字
    //例:
    public abstract void absFun();
    void  absMsg();
    void absMsg(String str);

    //接口的继承
    //接口可以通过extends的方式实现接口的多继承 但是要注意抽象类(abstract)只能实现单继承
    //例:
    // --- public interface IOneInterface extends PersonInterface,ICannel{}
    //实现又多继承的接口的子类(普通类)必须要实现所有的接口的抽象方法


    //接口中定义内部static接口
    //接口中定义的内部类都是被static关键字修饰
    static interface innerInterface {

    }

}
