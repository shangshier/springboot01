package com.boot.template.thread;

/**
 * @author: shangshanshan
 * @date: 2019-8-26 20:25
 * @Description: 线程名字的取得和获取
 */
public class MyThreadName implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadNameDemo {

    public static void main(String[] args) {

        //此示例说明当开发者为线程设置名字的时候就是用设置的名字,而如果没有设置名字,则会自动生成一个不重复的名字
        //这种自动的属性命名主要是依靠了static属性完成的,在Thread类中定义有如下操作:
        //源码：
        //public Thread(Runnable target) {
        //        init(null, target, "Thread-" + nextThreadNum(), 0);
        //}
        //private static int threadInitNumber;
        //private static synchronized int nextThreadNum() {
        //   return threadInitNumber++;
        //}
        MyThreadName mt = new MyThreadName();
        new Thread(mt,"线程A").start();//设置了线程的名字
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt,"线程B").start();
        //输出结果
        //线程A
        //Thread-1
        //Thread-0
        //Thread-2
        //线程B
    }
}

//在线程中主线程负责处理整体流程, 而子线程负责处理耗时操作
class ThreadMain {

    //主线程
    public static void main(String[] args) {

        System.out.println("1.执行操作任务一");
        System.out.println("2.执行操作任务2");
        System.out.println("3.执行操作任务3");
        System.out.println("4.执行操作任务4");

        //子线程
        new Thread(() ->{
            int temp = 0;
            for (int i = 0 ;i < Integer.MAX_VALUE; i++){
                temp += i;
            }
        }).start();
        //此时的子线程不会影响主线程的操作-主线程的执行速度会变快
        System.out.println("5.执行操作任务5");
        System.out.println("6.执行操作任务6");
        System.out.println("7.执行操作任务7");
        System.out.println("8.执行操作任务8");
        System.out.println("9.执行操作任务9");
        System.out.println("10.执行操作任务10");
    }
}
