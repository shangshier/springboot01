package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:45
 * @Description: TODO
 */
public class AbstractUZIBullet implements IAbstractBulletInterface {
    @Override
    public void makeBullet() {
        System.out.println("制作UZI子弹");
    }
}
