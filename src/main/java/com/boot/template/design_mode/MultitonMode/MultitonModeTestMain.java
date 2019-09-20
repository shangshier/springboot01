package com.boot.template.design_mode.MultitonMode;

/**
 * @author: shangshanshan
 * @date: 2019-8-1 21:24
 * @Description: TODO
 */
public class MultitonModeTestMain {

    public static void main(String[] args) {
        MultitonMode mode = MultitonMode.getMultitonMode("1");
        System.out.println(mode);
    }
}
