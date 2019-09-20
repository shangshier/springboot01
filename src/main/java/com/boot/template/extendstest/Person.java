package com.boot.template.extendstest;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * @author: shangshanshan
 * @date: 2019-6-27 21:17
 * @Description: 父类
 */
public class Person {

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void pubStFun(){
        System.out.println("父类公共的静态方法");

    }

    protected static void proStFun(){
        System.out.println("父类受保护的静态方法");
    }

    private static void privateStFun(){
        System.out.println("父类私有的静态方法");
    }

    private void priFun(){
        System.out.println("父类私有方法");
    }

    public void pubFun(){
        System.out.println("父类公共方法");
    }

    protected void proFun(){
        System.out.println("父类的受保护方法");
    }


//    public static String pubStr = "str";
//
//    protected static String proStr = "proStr";
//
//    private static String priStr = "priStr";

    @JsonProperty("name")
    @Value("#{张三}")
    private String name;

    @JsonProperty("age")
    @Value("#{123}")
    private Integer age;

    @JsonProperty("list")
    private List<String> list;

    @JsonProperty("son_class")
    private SonClass sonClass;

    @JsonProperty("son_class_list")
    private List<SonClass> sonClassList;

    @JsonProperty("bn")
    @Value("#{true}")
    private Boolean bn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public SonClass getSonClass() {
        return sonClass;
    }

    public void setSonClass(SonClass sonClass) {
        this.sonClass = sonClass;
    }

    public List<SonClass> getSonClassList() {
        return sonClassList;
    }

    public void setSonClassList(List<SonClass> sonClassList) {
        this.sonClassList = sonClassList;
    }

    public Boolean getBn() {
        return bn;
    }

    public void setBn(Boolean bn) {
        this.bn = bn;
    }
}
