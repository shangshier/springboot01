package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:18
 * @Description: 工厂方法模式-实现类-肉类
 */
public class FunctionMeat implements IFunctionInterface {
    @Override
    public void make() {
        System.out.println("制作油腻的红烧肉");
    }
}
