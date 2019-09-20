package com.boot.template.thread;

/**
 * @author: shangshanshan
 * @date: 2019-8-30 19:21
 * @Description: 线程的礼让
 */
public class MyThreadYield {

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(() ->{

            for (int y = 0 ; y<100 ; y++){

                if (y%2==0){
                    Thread.yield();
                    System.out.println("子线程礼让");
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        },"子线程");
        thread.start();
        for (int x = 0 ; x < 100 ; x++ ){
            Thread.sleep(100);
            System.out.println("========主线程执行========");
        }
    }
}
