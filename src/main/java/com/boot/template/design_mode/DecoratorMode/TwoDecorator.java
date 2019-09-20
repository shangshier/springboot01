package com.boot.template.design_mode.DecoratorMode;

/**
 * @author: shangshanshan
 * @date: 2019-9-19 15:40
 * @Description: 第二个装饰者方法
 */
public class TwoDecorator implements Decorator{

    private Component component;

    public TwoDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void componentFun() {
        component.componentFun();
        System.out.println("装饰者第二个方法");
    }
}
