package com.boot.template.desigm_mode_test.factory_mode.simple_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 20:52
 * @Description: 简单工厂模式-工厂类
 */
public class SimpleFactary {

    public static Object getCarType(Class<? extends ISimpleInterface> clazz){

        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
            return obj;
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
