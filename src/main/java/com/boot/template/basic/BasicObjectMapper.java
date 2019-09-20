package com.boot.template.basic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import org.apache.catalina.mapper.Mapper;

import java.io.IOException;

/**
 * @author: shangshanshan
 * @date: 2019-8-5 20:42
 * @Description: ObjectMapper测试
 */
public class BasicObjectMapper {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Persons p = new Persons("张三", "鹰硕", "23");

        String st = mapper.writeValueAsString(p);
        System.out.println(st);

        Persons ps = mapper.readValue(st,Persons.class);
        System.out.println(ps);
    }

}
