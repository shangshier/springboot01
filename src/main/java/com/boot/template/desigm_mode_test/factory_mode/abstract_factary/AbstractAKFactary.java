package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;


/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:47
 * @Description: TODO
 */
public class AbstractAKFactary implements IAbstractFactary {

    @Override
    public IAbstractGunInterface getGunType() {
        return new AbstractAK();
    }

    @Override
    public IAbstractBulletInterface getBulletType() {
        return new AbstractAKBullet();
    }
}
