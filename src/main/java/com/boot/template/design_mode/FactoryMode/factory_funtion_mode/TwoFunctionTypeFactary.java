package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:19
 * @Description: TODO
 */
public class TwoFunctionTypeFactary extends TwoFuntionFactary {
    @Override
    public <T extends IFunctionCars> T getType(Class<T> clazz) {
//        IFunctionCars cars = null;

        try {
//            cars = (IFunctionCars) Class.forName(clazz.getName()).newInstance();
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        return (T) cars;
        return null;
    }
}
