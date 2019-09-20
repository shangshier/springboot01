package com.boot.template.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: shangshanshan
 * @date: 2019-7-28 19:16
 * @Description: 注意:必须要加@Component交给Spring容器进行扫描 此处的依赖注入是@Component注解注入Spring容器内
 */
@Component
public class ApplicationStartRunPostConstructTest {

    @PostConstruct
    public void postConstructTest(){
        System.out.println("此注解是在对象依赖注入以后自动执行的");
    }
}
