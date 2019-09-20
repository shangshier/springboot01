package com.boot.template;

/**
 * @author: shangshanshan
 * @date: 2018-11-2 18:58
 * @Description: TODO
 */
public class GenericTest {

    public static void main(String[] args) {
                Box<String> name = new Box<String>("corn");
                System.out.println("name:" + name.getData());
            }
}


class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}