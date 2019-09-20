package com.boot.template.extendstest;

/**
 * @author: shangshanshan
 * @date: 2019-6-21 11:01
 * @Description: TODO
 */
public class GrandParmentClass {

    private String address;

    private String house;

    public GrandParmentClass() {
    }

    public GrandParmentClass(String address, String house) {
        this.address = address;
        this.house = house;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
