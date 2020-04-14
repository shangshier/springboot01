package com.boot.page.aop_aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author shangshanshan
 * @ClassName AspectjConfig
 * @date 2019-11-18 22:01
 * @Description TODO
 */
@Configuration
@ComponentScan("com.boot.page.aop_aspectj")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AspectjConfig {
}
