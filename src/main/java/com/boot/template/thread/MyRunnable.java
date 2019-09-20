package com.boot.template.thread;

import java.util.stream.IntStream;

/**
 * @author: shangshanshan
 * @date: 2019-8-21 21:32
 * @Description: TODO
 */
public class MyRunnable implements Runnable {

    //首先Runnable接口属于函数式接口

    private String title;

    private static int count = 10;

    public MyRunnable(String title) {
        this.title = title;
    }

    @Override
    public synchronized void run() {
//        IntStream.rangeClosed(0,10).forEach(e -> System.out.println(this.title + "运行, e = " + e ));
        count--;
        System.out.println(this.title + "运行 -- " + count);
    }
}


class RunnableDemo {

    public static void main(String[] args) {
        Thread threadA = new Thread(new MyRunnable("threadA"));
        Thread threadB = new Thread(new MyRunnable("threadB"));
        Thread threadC = new Thread(new MyRunnable("threadC"));

        threadA.start();
        threadB.start();
        threadC.start();
    }
}