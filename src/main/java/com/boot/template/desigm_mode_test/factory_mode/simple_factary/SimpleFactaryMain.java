package com.boot.template.desigm_mode_test.factory_mode.simple_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 20:57
 * @Description: 简单工厂main方法
 */
public class SimpleFactaryMain {

    public static void main(String[] args) {
        //创建bmw车
        ISimpleInterface bmw = (ISimpleInterface) SimpleFactary.getCarType(SimpleBmwCar.class);
        bmw.makeCar();

        //创建奔驰车
        ISimpleInterface benz = (ISimpleInterface) SimpleFactary.getCarType(SimpleBenzCar.class);
        benz.makeCar();

    }


}
