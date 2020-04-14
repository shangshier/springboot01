package com.boot.template.aop_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Business business = (Business) context.getBean("business");
        business.delete("askjdfajsdkfjasjdf");

    }

}