package com.boot.template.desigm_mode_test.proxy_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 22:13
 * @Description: TODO
 */
public class ProxyMain {

    public static void main(String[] args) {

        ProxyFactary factary = new ProxyFactary(new ProxyImpl());

        factary.commonFun();
    }
}
