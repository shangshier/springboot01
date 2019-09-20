package com.boot.template.Service;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: shangshanshan
 * @date: 2019-7-29 20:45
 * @Description: TODO
 */
public class User {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + age;
    }

    public void test(){
        List<User> list = new ArrayList<>();
        List<User> list1 = new ArrayList<>();
        list.stream().collect(Collectors.toMap(e ->e.toString(),e ->1,Integer::sum))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        ListUtils.retainAll(list,list1);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return age != null ? age.equals(user.age) : user.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
