package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:48
 * @Description: TODO
 */
public class AbstractM4A1Factary implements IAbstractFactary {

    @Override
    public IAbstractGunInterface getGunType() {
        return new AbstractM4A1();
    }

    @Override
    public IAbstractBulletInterface getBulletType() {
        return new AbstractM4A1Bullet();
    }
}
