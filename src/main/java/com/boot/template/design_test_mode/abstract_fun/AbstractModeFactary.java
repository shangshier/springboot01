package com.boot.template.design_test_mode.abstract_fun;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:30
 * @Description: 抽象类工厂
 */
public interface AbstractModeFactary {

    IGunInterface getGun();

    IBulletInterface getBullet();
}
