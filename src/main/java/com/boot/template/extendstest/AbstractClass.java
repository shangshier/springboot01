package com.boot.template.extendstest;

import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-6-24 10:27
 * @Description: 抽象类
 */
@Component
public abstract class AbstractClass implements InterfaceClass {

    @Override
    public int selectName(String name) {
        return 3;
    }

    @Override
    public String select(String str) {
        return "asdhakjhkzcnkasd";
    }

    public abstract void getStr();

    public String create(){
        return "测试一下";
    }

    private static String getBody() {
        return "private方法";
    }
}
