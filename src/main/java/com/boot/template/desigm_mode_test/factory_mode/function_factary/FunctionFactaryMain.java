package com.boot.template.desigm_mode_test.factory_mode.function_factary;

/**
 * @author: shangshanshan
 * @date: 2019-7-22 21:24
 * @Description: TODO
 */
public class FunctionFactaryMain {

    public static void main(String[] args) {

        //肉类
        IFunctionFactary meat = (IFunctionFactary) getFoodType(FunctionMeatFactary.class);
        meat.getRealizeClass().make();
        //蔬菜类
        IFunctionFactary vegetables = (IFunctionFactary) getFoodType(FunctionVegetablesFactary.class);
        vegetables.getRealizeClass().make();
        //水果类
        IFunctionFactary fruit = (IFunctionFactary) getFoodType(FunctionFruitFactary.class);
        fruit.getRealizeClass().make();

    }

    private static Object getFoodType(Class<? extends IFunctionFactary> clazz){

        Object object;

        try {
            object = Class.forName(clazz.getName()).newInstance();
            return object;
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new RuntimeException("类实例化异常");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("类未发现异常");
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("非法访问异常");
        }

    }
}
