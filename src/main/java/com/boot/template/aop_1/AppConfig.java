package com.boot.template.aop_1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com.boot.template.aop_1")
@EnableAspectJAutoProxy
public class AppConfig {}
