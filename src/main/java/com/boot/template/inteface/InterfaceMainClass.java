package com.boot.template.inteface;

import com.boot.template.ParentClass;
import org.apache.commons.collections4.Put;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: shangshanshan
 * @date: 2019-7-7 18:47
 * @Description: TODO
 */
public class InterfaceMainClass {




    public static void main(String[] args) {

//        MessageImpl message = (MessageImpl) () -> System.out.println();

        Map<String,String> map = new HashMap<String, String>(1){{put("1","张三");}};

        //由于实例化类是MessageImpl类 它是PersonInterface，ICannel 的实现类
        //pif指向的是new MessageImpl() 所有是能够转换为ICannel类的
        //同时Object是所有类的父类 所以是能够转换为Object

//        PersonInterface pif = new MessageImpl();
//        ICannel can = (ICannel) pif;
//        ParentClass obj = (ParentClass) can;
//        MessageImpl impl = new MessageImpl();
//        impl.msg();
//        String msg = IOneInterface.msg;
    }


}
