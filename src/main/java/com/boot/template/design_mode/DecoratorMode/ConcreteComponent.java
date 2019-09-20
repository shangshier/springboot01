package com.boot.template.design_mode.DecoratorMode;

/**
 * @author: shangshanshan
 * @date: 2019-9-19 15:16
 * @Description: 具体构件角色-被装饰者类
 */
public class ConcreteComponent implements Component{

    @Override
    public void componentFun() {
        System.out.println("被装饰者执行");
    }
}
