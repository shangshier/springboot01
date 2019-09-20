package com.boot.template.util;

import org.springframework.stereotype.Component;

/**
 * @author: shangshanshan
 * @date: 2019-7-28 19:12
 * @Description: 应用启动时自动加载
 * 注意:必须要加@Component交给Spring容器进行扫描
 */
@Component
public class ApplicationStartRunStaticTest {

    static {
        System.out.println("static 启动时静态代码块执行");
    }
}
