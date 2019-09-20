package com.boot.template.design_mode.MultitonMode;

/**
 * @author: shangshanshan
 * @date: 2019-8-1 21:17
 * @Description: TODO
 */
public class MultitonModeMain {

    public static void main(String[] args) {
        MultitonMode mode = MultitonMode.getMultitonMode("1");
        mode.setName("张三");
        mode.setAge("23");
        System.out.println("对象值1:" + mode);

        mode.setName("李四");
        mode.setAge("25");
        System.out.println("对象值1-2:" + mode);

        MultitonMode mode2 = MultitonMode.getMultitonMode("2");
        System.out.println("对象值2:" + mode2);
    }
}
