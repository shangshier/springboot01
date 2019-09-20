package com.boot.template.extendstest;

import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-6-24 10:28
 * @Description: 接口
 */
@Component
public interface InterfaceClass {

    int selectName(String name);

    String select(String str);

    void  get();
}
