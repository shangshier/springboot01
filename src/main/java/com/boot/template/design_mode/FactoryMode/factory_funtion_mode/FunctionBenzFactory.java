package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 18:35
 * @Description: TODO
 */
public class FunctionBenzFactory implements IFuntionFactary {
    @Override
    public IFunctionCars getCarType() {
        return new FunctionBenzCar();
    }
}
