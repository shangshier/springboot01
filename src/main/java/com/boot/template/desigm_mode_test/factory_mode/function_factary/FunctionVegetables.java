package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:17
 * @Description: 工厂方法模式-实现类-蔬菜类
 */
public class FunctionVegetables implements IFunctionInterface {
    @Override
    public void make() {
        System.out.println("制作健康的蔬菜汤");
    }
}
