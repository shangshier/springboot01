package com.boot.template.design_test_mode.abstract_fun;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:35
 * @Description: TODO
 */
public class UZIFactary implements AbstractModeFactary {
    @Override
    public IGunInterface getGun() {
        return new UZIGun();
    }

    @Override
    public IBulletInterface getBullet() {
        return new UZIBullet();
    }
}
