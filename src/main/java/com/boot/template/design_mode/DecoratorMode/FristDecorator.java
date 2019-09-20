package com.boot.template.design_mode.DecoratorMode;

/**
 * @author: shangshanshan
 * @date: 2019-9-19 15:29
 * @Description: 具体的装饰者
 */
public class FristDecorator implements Decorator {

    private Component component;

    public FristDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void componentFun() {
        component.componentFun();
        System.out.println("装饰者模式第一个方法");
    }
}
