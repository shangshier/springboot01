package com.boot.template.extendstest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author: shangshanshan
 * @date: 2019-7-15 21:43
 * @Description: TODO
 */
public class FieldMain {

    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException {


        Field[] fields = Person.class.getDeclaredFields();
        for (Field field : fields) {

            boolean isExistJson = field.isAnnotationPresent(JsonProperty.class);
            if (isExistJson) {
                System.out.println(field.getAnnotation(JsonProperty.class).value());
            }

            //获取元素名称
            String name = field.getName();
            //获取元素类型
            Class<?> type = field.getType();

            boolean bn = check(type,field,Person.class,name);
            if (bn) {
                System.out.println(name + "不为空");
            }

        }



    }

    private static boolean check(Class<?> type, Field field, Class<?> clazz,String name) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        boolean flag = false;

        if (type == String.class) {

            //获取元素get方法
            PropertyDescriptor pd = new PropertyDescriptor(name,clazz);
            Method method = pd.getReadMethod();
            String value = (String) method.invoke(clazz);
            if (value != null && !"".equals(value)) {
                flag = true;
            }
        }

        return flag;
    }
}
