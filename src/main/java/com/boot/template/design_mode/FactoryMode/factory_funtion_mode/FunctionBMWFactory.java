package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 18:34
 * @Description: TODO
 */
public class FunctionBMWFactory implements IFuntionFactary {

    @Override
    public IFunctionCars getCarType() {
        return new FunctionBMWCar();
    }
}
