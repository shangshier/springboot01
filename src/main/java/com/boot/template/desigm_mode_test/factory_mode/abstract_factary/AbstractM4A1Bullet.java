package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:44
 * @Description: TODO
 */
public class AbstractM4A1Bullet implements IAbstractBulletInterface {
    @Override
    public void makeBullet() {
        System.out.println("制作M4A1子弹");
    }
}
