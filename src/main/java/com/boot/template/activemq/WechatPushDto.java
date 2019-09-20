package com.boot.template.activemq;

import java.util.List;

/**
 * @author: shangshanshan
 * @date: 2018-10-29 17:01
 * @Description: TODO
 */
public class WechatPushDto {

    private String name;

    private String sex;

    private String age;

    private String phone;

    private List<String> userFkCodes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getUserFkCodes() {
        return userFkCodes;
    }

    public void setUserFkCodes(List<String> userFkCodes) {
        this.userFkCodes = userFkCodes;
    }
}
