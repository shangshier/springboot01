package com.boot.template.design_mode.FactoryMode.factory_funtion_mode;

/**
 * @author: shangshanshan
 * @date: 2019-7-21 18:36
 * @Description: TODO
 */
public class FunctionFactoryMain {

    public static void main(String[] args) {

        //制造一辆bmw
        FunctionBMWFactory bmw = (FunctionBMWFactory) getCarType(FunctionBMWFactory.class);
        bmw.getCarType().makeCar();
        //制造一辆Benz
        FunctionBenzFactory benz = (FunctionBenzFactory) getCarType(FunctionBenzFactory.class);
        benz.getCarType().makeCar();

        //第二种工厂方法
        TwoFunctionTypeFactary factary = new TwoFunctionTypeFactary();
        FunctionBMWCar bmwCar = factary.getType(FunctionBMWCar.class);
        bmwCar.makeCar();
        FunctionBenzCar benzCar = factary.getType(FunctionBenzCar.class);
        benzCar.makeCar();

    }

    //第一种工程方法
    public static Object getCarType(Class<? extends IFuntionFactary> clazz){

        try {
            Object iFuntionFactary = Class.forName(clazz.getName()).newInstance();
            return iFuntionFactary;
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException("实例化异常");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("非法访问异常");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("类未发现异常");
        }
    }



}
