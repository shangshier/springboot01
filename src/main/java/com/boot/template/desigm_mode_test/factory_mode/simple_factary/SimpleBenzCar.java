package com.boot.template.desigm_mode_test.factory_mode.simple_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 20:50
 * @Description: 简单工厂模式-Benz实现类
 */
public class SimpleBenzCar implements ISimpleInterface {
    @Override
    public void makeCar() {
        System.out.println("制造一辆奔驰车");
    }
}
