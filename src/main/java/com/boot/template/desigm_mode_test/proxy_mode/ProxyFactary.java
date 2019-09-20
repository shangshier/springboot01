package com.boot.template.desigm_mode_test.proxy_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 22:11
 * @Description: TODO
 */
public class ProxyFactary implements IProxyInterface {

    private IProxyInterface iProxyInterface;

    public ProxyFactary(IProxyInterface iProxyInterface) {
        this.iProxyInterface = iProxyInterface;
    }

    @Override
    public void commonFun() {
        fun1();
        iProxyInterface.commonFun();
        fun2();
    }

    private void fun1(){
        System.out.println("方法1");
    }

    private void fun2(){
        System.out.println("方法2");
    }
}
