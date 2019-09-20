package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:27
 * @Description: 抽象方法模式实现类
 */
public class AbstractFunctionAKGun implements IAbstractFunctionGun{

    @Override
    public void makeGun() {
        System.out.println("制造一把AK枪");
    }
}
