package com.boot.template.abstractclass;

/**
 * @author: shangshanshan
 * @date: 2019-7-2 21:22
 * @Description: TODO
 */
public abstract class SecondAbstract extends MessageParent {

    public SecondAbstract() {
    }

    public SecondAbstract(String type) {
        super(type);
    }

    private static void absStFun(){
        System.out.println("抽象类的私有的静态方法");
    }
}
