package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

/**
 * @author: shangshanshan
 * @date: 2019-8-19 21:44
 * @Description: TODO
 */
public class TwoAbstractFunctionFactory implements IAbstractFunctionFactory {
    @Override
    public IAbstractFunctionGun getGun() {
        return null;
    }

    @Override
    public <T extends IAbstractFunctionGun> T getGunType(Class<T> clazz) {

        IAbstractFunctionGun gun = null;

        try {
            gun = (IAbstractFunctionGun) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) gun;
    }

    @Override
    public IAbstractFunctionBullet getBullet() {
        return null;
    }

    @Override
    public <R extends IAbstractFunctionBullet> R getBulletType(Class<R> clazz) {

        IAbstractFunctionBullet bullet = null;

        try {
            bullet = (IAbstractFunctionBullet) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (R) bullet;
    }
}
