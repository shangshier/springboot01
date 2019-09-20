package com.boot.template.thread;

/**
 * @author: shangshanshan
 * @date: 2019-8-26 21:10
 * @Description: TODO
 */
public class MyTreadSleep {

    public static void main(String[] args) {
        //这是一个线程,for循环只是线程内run()方法的逻辑代码
        new Thread(() ->{
            for (int i= 0 ;i < 10; i++){
                System.out.println(Thread.currentThread().getName() + "、i =" + i);
                try {
                    //使用try-catch处理中断异常
                    //暂缓执行sleep()
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程名字").start();
    }
}

class moreThread {
    //当个线程时休眠结束后线程的执行也是有先后顺序的  不一定是当前休眠结束的线程立即执行

    //多线程中某一线程休眠后是否会立即执行?
    //不一定。因为你只是告诉操作系统：
    // 在未来的1000毫秒内我不想再参与到CPU竞争。
    // 那么1000毫秒过去之后，
    // 这时候也许另外一个线程正在使用CPU，
    // 那么这时候操作系统是不会重新分配CPU的，直到那个线程挂起或结束；
    // 况且，即使这个时候恰巧轮到操作系统进行CPU 分配，
    // 那么当前线程也不一定就是总优先级最高的那个，CPU还是可能被其他线程抢占去。

    // 与此相似的，Thread有个Resume函数，是用来唤醒挂起的线程的。
    // 好像上面所说的一样，这个函数只是“告诉操作系统我从现在起开始参与CPU竞争了”，
    // 这个函数的调用并不能马上使得这个线程获得CPU控制权。

    //某人的代码中用了一句看似莫明其妙的话：Thread.Sleep(0) 。既然是 Sleep 0 毫秒，那么他跟去掉这句代码相比，有啥区别么？
    //Thread.Sleep(0)的作用，就是“触发操作系统立刻重新进行一次CPU竞争”。
    // 竞争的结果也许是当前线程仍然获得CPU控制权，也许会换成别的线程获得CPU控制权。
    // 这也是我们在大循环里面经常会写一句Thread.Sleep(0) ，
    // 因为这样就给了其他线程比如Paint线程获得CPU控制权的权力，这样界面就不会假死在那里。

    public static void main(String[] args) {

        //创建多线程
        for (int num = 0 ;num<5; num++ ){
            new Thread(() ->{
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                for (int i= 0 ;i < 10; i++){
//                    System.out.println(Thread.currentThread().getName() + "、i =" + i);
//                    try {
//                        //使用try-catch处理中断异常
//                        //暂缓执行sleep()
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            },"当前线程" + num).start();
        }
    }
    //从此多线程的执行结果可以看出某线程的休眠结束后不一定会立即执行,当某一线程休眠结束后可能有其他的线程正在执行
    //或者当线程休眠结束后其他的线程的优先级高于此线程,所以此时这个线程不一定会立即执行
    //线程sleep()是为了让出cpu的资源给其他线程使用



}
