package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:14
 * @Description: TODO
 */
public abstract class TwoFuntionFactary {

    public abstract <T extends IFunctionCars> T getType(Class<T> clazz);
}
