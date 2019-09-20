package com.boot.template.abstractclass;

import com.boot.template.extendstest.InterfaceClass;

/**
 * @author: shangshanshan
 * @date: 2019-7-2 21:18
 * @Description: 抽象类父类
 */
public abstract class MessageParent implements InterfaceClass {

    private String type;

    public MessageParent() {
    }

    //抽象类一定有抽象方法
    public MessageParent(String type) {
        this.type = type;
    }

    public abstract void getInfor();

    //抽象方法中可以存在静态方法
    public static MessageParent getInforce(){
        return new ExtendsClass();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
