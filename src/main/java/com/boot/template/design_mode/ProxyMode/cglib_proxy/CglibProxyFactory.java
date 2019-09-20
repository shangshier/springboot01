package com.boot.template.design_mode.ProxyMode.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: shangshanshan
 * @date: 2019-9-18 21:14
 * @Description: Cglib代理工厂
 */
public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInterface(){
        //1. 实例化工具类
        Enhancer en = new Enhancer();
        //2. 设置父类对象
        en.setSuperclass(this.target.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类，也就是代理对象
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理开始之前的任务执行");
        //执行目标对象的方法
        Object returnValue = method.invoke(target,objects);

        System.out.println("cglib代理结束之后的任务执行");

        return returnValue;
    }

    public static void main(String[] args) {
        //目标对象
        CglibProxyClass cglibProxyClass = new CglibProxyClass();
        //生成代理对象
        CglibProxyClass proxyClass = (CglibProxyClass) new CglibProxyFactory(cglibProxyClass).getProxyInterface();
        //调用对象方法
        proxyClass.fun();
        proxyClass.save();
    }
}
