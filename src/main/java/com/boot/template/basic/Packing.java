package com.boot.template.basic;

import java.lang.reflect.Field;

/**
 * @author: shangshanshan
 * @date: 2019-8-22 17:20
 * @Description: 装箱与拆箱
 */
public class Packing {

    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        method(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("-------------------");

        //int类型的数值是直接存在栈中的 Integer类型的数值是存在方法区的常量池中

        int c = 127;
        Integer d = 127;

        System.out.println();

        int e = 128;
        Integer f = new Integer(128);


        //true -- 这是因为c是在栈中 c==d其实就是相当于 c==d.IntValue() 而d.IntValue=127,所以两边就是两个int在比较 --这个是自动拆箱
        System.out.println(c == d);
        //true -- 自动拆箱和Integer缓存的范围没关系(-128 - 127之间 )
        System.out.println(e == f);

        int m = 70;
        Integer n = new Integer(50);
        Integer p = new Integer(20);
        //true int类型和Integer类型比较的时候都是会进行自动拆箱的 Integer会自动拆箱为int 然后比较的结果就是两个int类型相互比较
        System.out.println(m == n + p);

        //自动装箱  -- 下面的x,y的表达式其实就是相当于 Integer x = Integer.valueOf(120);
        //当Integer的值的范围在(-128 - 127之间)的时候会在方法区常量池中查询Integer的缓存中是否已存在这个值如果存在直接指向 如果不存在则存入
        //所以此时的x,y其实就是同一个对象
        Integer x = 120;
        Integer y = 120;


        Integer s = new Integer(200);
        Integer t = new Integer(100);
        Integer w = new Integer(100);
        //true 这个计算式其实就是自动拆箱  首先 t + w 就相当于 t.intValue() +　w.intValue() 自动拆箱为int值
        //然后 s == t + w 就相当于 s == t.intValue() +　w.intValue() 就是 Integer与int相比较 然后就进行自动拆箱
        System.out.println(s == t + w);

    }


    private static void method(Integer a, Integer b) {
        changeValue(a, 100);
        changeValue(b, 200);
    }

    private static void changeValue(Integer i, int value) {
        try {
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(i, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
