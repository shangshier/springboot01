package com.boot.page.use_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shangshanshan
 * @ClassName BeanPostProcessorTest
 * @date 2019-10-15 15:51
 * @Description TODO
 */
@Component
public class BeanPostProcessorTest {

//    @Autowired
//    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        BeanPostProcessorTest test = (BeanPostProcessorTest) applicationContext.getBean("beanPostProcessorTest");
        System.out.println(test.getClass().getName());
    }
}
