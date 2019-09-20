package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:21
 * @Description: 水果类-工厂类
 */
public class FunctionFruitFactary implements IFunctionFactary {
    @Override
    public IFunctionInterface getRealizeClass() {
        return new FunctionFruit();
    }
}
