package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-8-9 11:05
 * @Description: TODO
 */
class A {
    public String show(D obj){
        return ("A and D");
    }

    public String show(A obj){
        return ("A and A");
    }
}

class B extends A {
    public String show(B obj){
        return ("B and B");
    }

    @Override
    public String show(A obj) {
        return ("A and B");
    }
}

class C extends B {}
class D extends B {}
