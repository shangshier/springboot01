package com.boot.template.inteface;

/**
 * @author: shangshanshan
 * @date: 2019-7-7 18:45
 * @Description: TODO
 */
public interface ICannel {

    void cannel();

    default void msgs(){

        System.out.println("2132134345");
    }

    default void msgs(String msg){
        System.out.println("asdakdhaksdhjk");
    }
}
