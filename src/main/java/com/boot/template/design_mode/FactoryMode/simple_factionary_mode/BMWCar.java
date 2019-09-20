package com.boot.template.design_mode.FactoryMode.simple_factionary_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 16:34
 * @Description: 简单工程模式实现类
 */
public class BMWCar implements ICars {

    @Override
    public void makeCar() {
        System.out.println("制造一个BWM车");
    }
}
