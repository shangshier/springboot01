package com.boot.template.desigm_mode_test.factory_mode.abstract_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:55
 * @Description: TODO
 */
public class AbstractFunctionMain {

    public static void main(String[] args) {
        IAbstractFactary ak = (IAbstractFactary) getFactaryType(AbstractAKFactary.class);
        ak.getGunType().makeGun();
        ak.getBulletType().makeBullet();

        IAbstractFactary m4a1 = (IAbstractFactary) getFactaryType(AbstractM4A1Factary.class);
        m4a1.getGunType().makeGun();
        m4a1.getBulletType().makeBullet();

        IAbstractFactary uzi = (IAbstractFactary) getFactaryType(AbstractUZIFactary.class);
        uzi.getGunType().makeGun();
        uzi.getBulletType().makeBullet();
    }

    private static Object getFactaryType(Class<? extends IAbstractFactary> clazz){

        Object object;

        try {
            object = Class.forName(clazz.getName()).newInstance();
            return object;
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException("类实例化异常");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("非法访问异常");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("类未发现异常");
        }
    }
}
