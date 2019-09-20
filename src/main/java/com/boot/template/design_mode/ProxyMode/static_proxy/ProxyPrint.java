package com.boot.template.design_mode.ProxyMode.static_proxy;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 20:13
 * @Description: 代理模式实现类
 */
public class ProxyPrint implements IProxyInterface {
    @Override
    public void print() {
        System.out.println("代理模式实现类");
    }
}
