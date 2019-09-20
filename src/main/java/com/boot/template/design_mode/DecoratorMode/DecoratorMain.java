package com.boot.template.design_mode.DecoratorMode;

/**
 * @author: shangshanshan
 * @date: 2019-9-19 15:46
 * @Description: 装饰者模式测试
 */
public class DecoratorMain {

    public static void main(String[] args) {

        TwoDecorator decorator = new TwoDecorator(new FristDecorator(new ConcreteComponent()));
        decorator.componentFun();

    }
}
