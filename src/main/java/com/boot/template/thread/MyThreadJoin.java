package com.boot.template.thread;

/**
 * @author: shangshanshan
 * @date: 2019-8-29 21:48
 * @Description: TODO
 */
public class MyThreadJoin {

    public static void main(String[] args) throws Exception {

        //获取主线程
        Thread threads = Thread.currentThread();

        Thread thread = new Thread(() ->{
            for (int i = 0 ; i<100 ; i++){

                if (i == 3){
                    try {
                        threads.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + i);
            }
        },"子线程");
        thread.start();

        for (int x = 0 ; x < 100 ; x++){
            //主线程休眠
            Thread.sleep(100);
            System.out.println("主线程执行");
        }
    }
}
