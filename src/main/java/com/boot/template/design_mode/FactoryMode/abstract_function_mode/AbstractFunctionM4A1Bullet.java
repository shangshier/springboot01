package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:31
 * @Description: 抽象方法模式实现类
 */
public class AbstractFunctionM4A1Bullet implements IAbstractFunctionBullet {

    @Override
    public void makeBullet() {
        System.out.println("制造M4A1子弹");
    }
}
