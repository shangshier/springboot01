package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:22
 * @Description: 肉类工厂类
 */
public class FunctionMeatFactary implements IFunctionFactary {
    @Override
    public IFunctionInterface getRealizeClass() {
        return new FunctionMeat();
    }
}
