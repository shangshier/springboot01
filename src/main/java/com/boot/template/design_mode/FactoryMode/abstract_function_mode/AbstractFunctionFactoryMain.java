package com.boot.template.design_mode.FactoryMode.abstract_function_mode;

import com.boot.template.desigm_mode_test.factory_mode.abstract_factary.AbstractM4A1;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 19:39
 * @Description: TODO
 */
public class AbstractFunctionFactoryMain {

    public static void main(String[] args) {

        //制造AK
        AbstractFunctionAKFactory ak = (AbstractFunctionAKFactory) getGunType(AbstractFunctionAKFactory.class);
        ak.getGun().makeGun();
        ak.getBullet().makeBullet();

        //制造M4A1
        AbstractFunctionM4A1Factory m4a1 = (AbstractFunctionM4A1Factory) getGunType(AbstractFunctionM4A1Factory.class);
        m4a1.getGun().makeGun();
        m4a1.getBullet().makeBullet();

        TwoAbstractFunctionFactory factory = new TwoAbstractFunctionFactory();
        //AK
        AbstractFunctionAKGun akGun = factory.getGunType(AbstractFunctionAKGun.class);
        akGun.makeGun();
        AbstractFunctionM4A1Gun m4A1Gun = factory.getGunType(AbstractFunctionM4A1Gun.class);
        m4A1Gun.makeGun();
        AbstractFunctionAKBullet akBullet = factory.getBulletType(AbstractFunctionAKBullet.class);
        AbstractFunctionM4A1Bullet m4A1Bullet = factory.getBulletType(AbstractFunctionM4A1Bullet.class);
        akBullet.makeBullet();
        m4A1Bullet.makeBullet();
    }

    public static Object getGunType(Class<? extends IAbstractFunctionFactory> clazz){

        try {
            Object obj = Class.forName(clazz.getName()).newInstance();
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException("实例化异常");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("类未发现异常");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("非法访问异常");
        }
    }
}
