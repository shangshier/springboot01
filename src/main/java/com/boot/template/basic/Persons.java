package com.boot.template.basic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: shangshanshan
 * @date: 2019-8-5 20:46
 * @Description: TODO
 */
public class Persons {

    @JsonProperty(value = "p_name")
    private String name;

    @JsonProperty("p_unit")
    private String unit;

    @JsonProperty("p_age")
    private String age;

    public Persons() {
    }

    public Persons(String name, String unit, String age) {
        this.name = name;
        this.unit = unit;
        this.age = age;
    }

    @JsonProperty(value = "p_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("p_unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("p_age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
