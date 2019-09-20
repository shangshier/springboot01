package com.boot.template.thread;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: shangshanshan
 * @date: 2019-8-24 20:07
 * @Description: TODO
 */
public class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {

        for (int i = 0 ;i <5; i++){
            System.out.println("线程执行");
        }

        return "******线程执行完毕******";
    }

//    public Object getProxyInstance() {
//        //利用反射机制动态的构建一个代理对象
//        Object object = Proxy.newProxyInstance(this.target.getClass().getClassLoader(), target.getClass().getInterfaces(), (InvocationHandler) (proxy, method, args) -> {
//            //利用反射机制获取 代理对象的方法执行后的结果
//            System.out.println("反射方法执行前");
//            Object returnVal = method.invoke(target, args);
//            System.out.println("反射方法执行后");
//            return returnVal;
//        });
//        return object;
//    }
}

class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());

    }
}