package com.boot.template.thread;

/**
 * @author: shangshanshan
 * @date: 2019-8-29 20:50
 * @Description: 线程中断
 */
public class MyThreadInterrupt {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() ->{
            System.out.println("线程启动-----");
//            try {
//                System.out.println("线程休眠开始");
////                Thread.sleep(10000);
//                System.out.println("线程休眠结束");
//            } catch (InterruptedException e) {
//                System.out.println("线程被中断");
//            }
        });
        thread.start();
        //线程休眠1秒时让线程中断
        Thread.sleep(1000);
        //判断线程是否已被中断
        if (!thread.isInterrupted()){
            //中断线程
            thread.interrupt();
        }
    }
}

//多线程中的某一个中断
class MoreThreadInterrupt implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程启动");
        try {
            //线程休眠
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + "线程休眠结束");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "线程中断");
        }

    }
}

class MoreThreadInterruptDemo {



    public static void main(String[] args) throws Exception{
        Thread threadA = new Thread(new MoreThreadInterrupt(),"ThreadA");
        Thread threadB = new Thread(new MoreThreadInterrupt(),"ThreadB");
        Thread threadC = new Thread(new MoreThreadInterrupt(),"ThreadC");

        threadA.start();
        threadB.start();
        threadC.start();

        Thread.sleep(2000);
        if (!threadB.isInterrupted()){
            //中断线程
            threadB.interrupt();
        }
    }
}