package com.boot.template.design_mode.ProxyMode.static_proxy;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 20:18
 * @Description: TODO
 */
public class ProxyMainClass {

    public static void main(String[] args) {

        IProxyInterface iProxyInterface = new ProxyPrint();

        ProxyClass proxyClass = new ProxyClass(iProxyInterface);

        proxyClass.print();
    }
}
