package com.boot.template.design_mode.FactoryMode.simple_factionary_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 16:35
 * @Description: 简单工厂模式
 */
public class BenzCar implements ICars {

    @Override
    public void makeCar() {
        System.out.println("制造一辆奔驰车");
    }
}
