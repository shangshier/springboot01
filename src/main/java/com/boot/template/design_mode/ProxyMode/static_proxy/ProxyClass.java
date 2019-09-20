package com.boot.template.design_mode.ProxyMode.static_proxy;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 20:14
 * @Description: 代理模式-代理类
 */
public class ProxyClass implements IProxyInterface {

    private IProxyInterface proxyPrint;

    public ProxyClass(IProxyInterface proxyPrint) {
        this.proxyPrint = proxyPrint;
    }

    private void fun1(){
        System.out.println("代理模式方法1");
    }

    @Override
    public void print() {
        client();
        proxyPrint.print();
        fun1();
        fun2();
    }

    private void fun2(){
        System.out.println("代理模式方法2");
    }

    private void client(){
        System.out.println("客户端连接");
    }
}
