package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 18:31
 * @Description: 工厂方法模式实现类
 */
public class FunctionBenzCar implements IFunctionCars {

    @Override
    public void makeCar() {
        System.out.println("制造一辆奔驰汽车");
    }
}
