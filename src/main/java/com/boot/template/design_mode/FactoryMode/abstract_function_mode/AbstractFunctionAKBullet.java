package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:30
 * @Description: TODO
 */
public class AbstractFunctionAKBullet implements IAbstractFunctionBullet {
    @Override
    public void makeBullet() {
        System.out.println("制造AK子弹");
    }
}
