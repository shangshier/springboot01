package com.boot.template.design_mode.ProxyMode.dynamic_proxy;

/**
 * @author: shangshanshan
 * @date: 2019-9-18 20:11
 * @Description: 动态代理实现
 */
public class DynamicProxyImpl implements IDynamicProxyInterface {

    @Override
    public void save() {
        System.out.println("动态代理");
    }
}
