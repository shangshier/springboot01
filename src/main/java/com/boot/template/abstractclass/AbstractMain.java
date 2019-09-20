package com.boot.template.abstractclass;

/**
 * @author: shangshanshan
 * @date: 2019-7-11 21:38
 * @Description: TODO
 */
public class AbstractMain {

    public static void main(String[] args) {

        AbstractParent parent = new AbstractSon();

        parent.abstrProFun();

    }
}
