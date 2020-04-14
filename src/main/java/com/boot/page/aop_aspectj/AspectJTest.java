package com.boot.page.aop_aspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shangshanshan
 * @ClassName AspectJTest
 * @date 2019-11-18 22:15
 * @Description TODO
 */
public class AspectJTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AspectjConfig.class);
        AopAspectjService service = configApplicationContext.getBean(AopAspectjService.class);
        service.getName();
    }
}
