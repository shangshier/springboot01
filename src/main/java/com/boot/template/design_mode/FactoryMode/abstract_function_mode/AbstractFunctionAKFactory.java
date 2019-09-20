package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

import com.boot.template.desigm_mode_test.factory_mode.abstract_factary.IAbstractBulletInterface;
import com.boot.template.desigm_mode_test.factory_mode.abstract_factary.IAbstractGunInterface;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:36
 * @Description: 抽象方法工厂实现类
 */
public class AbstractFunctionAKFactory implements IAbstractFunctionFactory {

    @Override
    public IAbstractFunctionGun getGun() {
        return new AbstractFunctionAKGun();
    }

    @Override
    public <T extends IAbstractFunctionGun> T getGunType(Class<T> clazz) {
        return null;
    }

    @Override
    public IAbstractFunctionBullet getBullet() {
        return new AbstractFunctionM4A1Bullet();
    }

    @Override
    public <R extends IAbstractFunctionBullet> R getBulletType(Class<R> clazz) {
        return null;
    }
}
