package com.boot.template.thread;

import java.util.stream.IntStream;

/**
 * @author: shangshanshan
 * @date: 2019-8-21 20:40
 * @Description: TODO
 */

public class MyThread extends Thread {


    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {

        IntStream.rangeClosed(0,10).forEach(e -> System.out.println(this.title + "运行, e = " + e ));
    }

}

class ThreadDemo {
    public static void main(String[] args) {
//        new MyThread("线程A").run();
//        new MyThread("线程B").run();
//        new MyThread("线程C").run();

        //每一个线程只允许启动一次如果重复启动就会抛出IllegalThreadStateException异常
        //任何情况下，只要定义了多线程，多线程的启动必须使用Thread中的start()方法,
        //因为在java程序执行的过程中考虑到对不同层次开发者(使用不同的操作系统,如（Windows、Linux、Unix）)的需求，
        // 所以其支持有本地操作系统函数调用，而这项技术就被称为叫做JNI(java native Inteface)技术
        //但是在Java开发过程之中并不推荐这样使用,利用这项技术我们可以使用一些操作系统提供底层函数进行一些特殊的处理
        //而在Thread类里面提供的start()方法中有一个start0() 就表示需要将此方法依赖于不同的操作系统实现

//        new MyThread("线程A").start();
//        new MyThread("线程B").start();
//        new MyThread("线程C").start();

        new Thread(() ->{
            System.out.println("执行一个线程");
        }).start();
    }
}

