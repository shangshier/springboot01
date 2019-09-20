package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:23
 * @Description: TODO
 */
public class FunctionVegetablesFactary implements IFunctionFactary {
    @Override
    public IFunctionInterface getRealizeClass() {
        return new FunctionVegetables();
    }
}
