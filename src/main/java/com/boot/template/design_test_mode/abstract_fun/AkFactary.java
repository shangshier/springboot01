package com.boot.template.design_test_mode.abstract_fun;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:34
 * @Description: TODO
 */
public class AkFactary implements AbstractModeFactary {


    @Override
    public IGunInterface getGun() {
        return new AkGun();
    }

    @Override
    public IBulletInterface getBullet() {
        return new AkBullet();
    }
}
