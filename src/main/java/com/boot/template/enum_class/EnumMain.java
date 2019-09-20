package com.boot.template.enum_class;

/**
 * @author: shangshanshan
 * @date: 2019-8-7 21:55
 * @Description: TODO
 */
public class EnumMain {

    public static void main(String[] args) {
        for (EnumClass c : EnumClass.values()){
            System.out.println(c.ordinal() + "-" + c.name());
        }
    }
}
