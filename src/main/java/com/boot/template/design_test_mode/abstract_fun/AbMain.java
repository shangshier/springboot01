package com.boot.template.design_test_mode.abstract_fun;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:36
 * @Description: TODO
 */
public class AbMain {

    public static void main(String[] args) {

        //AK
        AkFactary akFactary = new AkFactary();
        akFactary.getGun().makeGun();
        akFactary.getBullet().makeBullet();

        UZIFactary uziFactary = new UZIFactary();
        uziFactary.getGun().makeGun();
        uziFactary.getBullet().makeBullet();
    }
}
