package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:46
 * @Description: TODO
 */
public interface IAbstractFactary {

    IAbstractGunInterface getGunType();

    IAbstractBulletInterface getBulletType();
}
