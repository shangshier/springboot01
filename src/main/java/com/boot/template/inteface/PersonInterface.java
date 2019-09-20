package com.boot.template.inteface;

/**
 * @author: shangshanshan
 * @date: 2019-7-7 17:21
 * @Description: 接口
 */
public interface PersonInterface {

    default void worker(){

    }

    default void msgs(){

        System.out.println("2132134345");
    }

    static void staticFuntion(){
        System.out.println("这是一个接口的静态方法");
    }

    String STR = "小朋友";

    void eat();

    String sleep();

    enum enumClass {
        ONE("0000","成功"),
        TWO("0001","失败"),
        THREE("0003","系统错误");

        private String code;
        private String msg;

        enumClass(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
