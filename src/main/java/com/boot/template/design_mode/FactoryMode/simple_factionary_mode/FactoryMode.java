package com.boot.template.design_mode.FactoryMode.simple_factionary_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-20 17:43
 * @Description: 工厂类设计模式
 */
public class FactoryMode {


    public static ICars getCar(String carType){

        if (carType.equalsIgnoreCase("BMW")){
            return new BMWCar();
        } else if (carType.equalsIgnoreCase("Benz")){
            return new BenzCar();
        }
        return null;
    }

    //getCar方法每次添加新的车型都会去修改工厂方法
    //现在利用反射解决这个问题
    public static Object getCar(Class<? extends ICars> clszz){

        Object object = null;

        try {
            object = Class.forName(clszz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
