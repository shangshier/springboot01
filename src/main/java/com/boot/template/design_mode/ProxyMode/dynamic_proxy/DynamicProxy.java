package com.boot.template.design_mode.ProxyMode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: shangshanshan
 * @date: 2019-9-18 20:12
 * @Description: 动态代理类
 * 1.代理对象不需要实现目标对象的接口。
 * 2.代理对象的生成，使用的是Java的API，动态的在内存中构件代理对象(这需要我们指定创建代理对象/目标对象的接口的类型)。
 * 3.动态代理也叫做JDK代理、接口代理。
 *
 */
public class DynamicProxy {

    //维护一个目标对象
    private Object target;
    //对象构造时，提供目标对象
    public DynamicProxy(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInterface(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new CustomInvocationHandler(target)
//                (proxy, method, args) -> {
//                    beginFun();
//                    Object returnValue = method.invoke(target,args);
//                    endFun();
//                    return returnValue;
//                }
        );
    }


    private void beginFun(){
        System.out.println("执行目标之前的方法");
    }

    private void endFun(){
        System.out.println("执行目标之后的方法");
    }

    public static void main(String[] args) {
        //目标对象
        IDynamicProxyInterface dynamicProxyInterface = new DynamicProxyImpl();
        //原始类型
        System.out.println(dynamicProxyInterface.getClass());

        //给定目标对象,动态创建代理对象
        IDynamicProxyInterface proxy = (IDynamicProxyInterface) new DynamicProxy(dynamicProxyInterface).getProxyInterface();
        Class[] clazz = proxy.getClass().getInterfaces();
        //代理对象类型
        System.out.println(proxy.getClass());

        proxy.save();

    }
}
