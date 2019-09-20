package com.boot.template.design_mode.FactoryMode.abstract_function_mode;


/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:33
 * @Description: 抽象方法工厂类
 */
public interface IAbstractFunctionFactory {

    //制造枪支
    IAbstractFunctionGun getGun();

    <T extends IAbstractFunctionGun> T getGunType(Class<T> clazz);

    //制造子弹
    IAbstractFunctionBullet getBullet();

    <R extends IAbstractFunctionBullet> R getBulletType(Class<R> clazz);
}
