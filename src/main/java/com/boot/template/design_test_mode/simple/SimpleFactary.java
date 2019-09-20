package com.boot.template.design_test_mode.simple;

/**
 * @author: shangshanshan
 * @date: 2019-8-6 10:38
 * @Description: TODO
 */
public class SimpleFactary {

//    private SimpleInterface simpleInterface;
//
//    public SimpleFactary(SimpleInterface simpleInterface) {
//        this.simpleInterface = simpleInterface;
//    }
//
//    public void test(){
//        simpleInterface.make();
//    }

    public static Object getType(Class<? extends SimpleInterface> clazz){

        try {
            Object ob = Class.forName(clazz.getName()).newInstance();
            return ob;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
