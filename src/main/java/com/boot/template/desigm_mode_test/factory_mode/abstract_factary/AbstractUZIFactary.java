package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:49
 * @Description: TODO
 */
public class AbstractUZIFactary implements IAbstractFactary {

    @Override
    public IAbstractGunInterface getGunType() {
        return new AbstractUZI();
    }

    @Override
    public IAbstractBulletInterface getBulletType() {
        return new AbstractUZIBullet();
    }
}
