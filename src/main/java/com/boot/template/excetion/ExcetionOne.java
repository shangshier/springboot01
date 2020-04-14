package com.boot.template.excetion;

/**
 * @program: springboot01
 * @Date: 2019-9-26 20:11
 * @Author: shangshanshan
 * @Description:
 */
public class ExcetionOne {

    public static boolean test1(String str) {

            Long ln = Long.valueOf(str);
            return true;



    }

    public static void main(String[] args) {

        try {
            test1("asdasdada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
