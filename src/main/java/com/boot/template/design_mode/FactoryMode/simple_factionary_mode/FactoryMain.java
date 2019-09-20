package com.boot.template.design_mode.FactoryMode.simple_factionary_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 16:40
 * @Description: TODO
 */
public class FactoryMain {

    public static void main(String[] args) {

        //创建一辆BMW车
        ICars cars = FactoryMode.getCar("BMW");
        cars.makeCar();

        //创建一辆奔驰车
        ICars cars1 = FactoryMode.getCar("Benz");
        cars1.makeCar();

        //创建一辆BMW车
        BMWCar bmw = (BMWCar) FactoryMode.getCar(BMWCar.class);
        bmw.makeCar();
        //创建一辆奔驰车
        BenzCar benzCar = (BenzCar) FactoryMode.getCar(BenzCar.class);
        benzCar.makeCar();
    }
}
