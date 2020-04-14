package com.boot.page.aop_aspectj;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author shangshanshan
 * @ClassName AopAspectjServiceImpl
 * @date 2019-11-18 22:03
 * @Description TODO
 */
@Repository
public class AopAspectjServiceImpl implements AopAspectjService {
    @Override
    public void getName() {
        System.out.println("张三");
    }

    @Override
    public void getAge() {
        System.out.println("15");
    }

    public void getAlias(){
        System.out.println("李四");
    }
}
