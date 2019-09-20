package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 18:29
 * @Description: 工厂方法模式实现类
 */
public class FunctionBMWCar implements IFunctionCars {

    @Override
    public void makeCar() {
        System.out.println("制造一辆BMW汽车");
    }
}
