package com.boot.template.design_test_mode.simple;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * @author: shangshanshan
 * @date: 2019-8-6 10:45
 * @Description: TODO
 */
public class SimpleMain {

    public static void main(String[] args) {

        System.out.println("当前时间戳" + LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant().getEpochSecond());

        SimpleClass simpleClass = (SimpleClass) SimpleFactary.getType(SimpleClass.class);
        simpleClass.make();
    }
}
