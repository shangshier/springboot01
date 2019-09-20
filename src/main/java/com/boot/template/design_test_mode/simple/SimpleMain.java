package com.boot.template.design_test_mode.simple;

/**
 * @author: shangshanshan
 * @date: 2019-8-6 10:45
 * @Description: TODO
 */
public class SimpleMain {

    public static void main(String[] args) {

        SimpleClass simpleClass = (SimpleClass) SimpleFactary.getType(SimpleClass.class);
        simpleClass.make();
    }
}
