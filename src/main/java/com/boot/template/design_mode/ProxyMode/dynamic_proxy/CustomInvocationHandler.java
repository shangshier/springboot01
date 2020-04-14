package com.boot.template.design_mode.ProxyMode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author shangshanshan
 * @ClassName CustomInvocationHandler
 * @date 2019-11-23 17:59
 * @Description TODO
 */
public class CustomInvocationHandler implements InvocationHandler {

    //目标类
    private Object target;

    public CustomInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        beginFun();
        return method.invoke(target,args);
    }

    private void beginFun(){
        System.out.println("执行目标之前的方法");
    }
}
