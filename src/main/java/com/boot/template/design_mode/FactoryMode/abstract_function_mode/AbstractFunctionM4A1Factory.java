package com.boot.template.design_mode.FactoryMode.abstract_function_mode;


/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:38
 * @Description: 抽象方法工厂实现类
 */
public class AbstractFunctionM4A1Factory implements IAbstractFunctionFactory {

    @Override
    public IAbstractFunctionGun getGun() {
        return new AbstractFunctionM4A1Gun();
    }

    @Override
    public IAbstractFunctionBullet getBullet() {
        return new AbstractFunctionM4A1Bullet();
    }

    @Override
    public <T extends IAbstractFunctionGun> T getGunType(Class<T> clazz) {
        return null;
    }

    @Override
    public <R extends IAbstractFunctionBullet> R getBulletType(Class<R> clazz) {
        return null;
    }
}
