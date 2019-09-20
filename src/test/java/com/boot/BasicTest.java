package com.boot;

import com.boot.template.extendstest.SonClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.ListUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: shangshanshan
 * @date: 2019-5-14 11:38
 * @Description: 基础知识测试类
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BasicTest {

    class ClassInfor {
        private String className;

        private String classInfor;

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getClassInfor() {
            return classInfor;
        }

        public void setClassInfor(String classInfor) {
            this.classInfor = classInfor;
        }

//        //自定义排序规则
//        public List<ClassInfor> sort(){
//
//
//
//        }

    }


    @Test
    public void dateChange(){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date(1557820800);

        System.out.println(date);

        Date date1 = new Date(2019,05,14,8,0,0);

        System.out.println(format.format(date1));


    }

    @Test
    public void stringTest(){
        //字符串与字符
        String str = "www.baidu.com";
        System.out.println(str.charAt(4)); //获取指定位置的字符
        char st [] = str.toCharArray();//转换为char数组
        for (char ch : st) {
            System.out.println(ch);
        }

        System.out.println("----------" + str.substring(0,4));
        System.out.println("+++++++++++++" + str.substring(0,str.indexOf(".")));

        //字符串与字节
        byte bt [] = str.getBytes();
        for (byte ch : bt) {
            System.out.println(ch);
        }

        //字符串比较-比较的是字符的ASCII
        String str1 = "xn";
        String str2 = "xN";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//不区分大小写比较

        //字符串比较-比较的是字符的ASCII
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));//不区分大小写比较

        System.out.println("字符串查找");
        String str3 = "www.shang.shanshan.com";
        System.out.println(str3.contains("shang"));
        System.out.println(str3.indexOf("shang",4));//从指定位置查找位置
        System.out.println(str3.lastIndexOf("."));//从后往前查找指定字符串的位置
        System.out.println(str3.startsWith("www"));//是否已制定字符串开头
        System.out.println(str3.endsWith("com"));//是否以指定字符串结尾

        System.out.println("字符串替换");
        System.out.println(str3.replaceAll("\\.","-"));
        System.out.println(str3.replaceFirst("\\.","-"));
        System.out.println(str3.replace(".","-"));

        System.out.println("字符串拆分");
        String[] strings = str3.split(".");
        for (String string : strings) {
            System.out.println(string);
        }

        String str4 = "192.68.9.2";
        String[] strings1 = str4.split("\\.");
        for (String string : strings1) {
            System.out.println(string);
        }

        System.out.println("字符串截取");
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(str3.indexOf("www") + 1,9));

        System.out.println("其他方法");
        System.out.println("123".concat("456").contains("789"));
        System.out.println(str4.length());
        System.out.println(" 去掉左右 空格 ".trim());
        System.out.println("xm".toUpperCase());
        System.out.println("XM".toLowerCase());

//        String t = "年底-阿斯达多-按时";
//        System.out.println(t.substring(t.indexOf("阿斯达多") + 1,));
    }

    @Test
    public void test(){

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        List<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");

        List<String> list1 = ListUtils.subtract(list2,list);
        System.out.println(String.join(",",list1));


        String[] arr = list.toArray(new String[list.size()]);

        for (int i = 0 ;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test1(){

        //手工装箱
        Integer it = new Integer(10);
        //手工拆箱
        int num = it.intValue();

        //自从JDK1.5之后就提供了基本数据类型包装类的自动装箱与拆箱 - 以下案例适用于所有基本数据类型
        //自动装箱与拆箱
        Integer int1 = 127;
        Integer int2 = 127;

        System.out.println(int1 == int2); //true

        Integer int3 = 128;
        Integer int4 = 128;
        //出现这种情况是由于Int的取值范围为-128~127 超过了这个范围就不属于包装类啊属于Object要使用equals()方法判断大小
        System.out.println(int3 == int4); //false
        System.out.println(int3.equals(int4)); //true

    }

    @Test
    public void trimTest() throws JsonProcessingException {
        SonClass son = new SonClass("张三","23");
        SonClass son1 = new SonClass("李四","23");
        SonClass son2 = new SonClass("王五","23");
        SonClass son3 = new SonClass("赵六","23");

        List<SonClass> list = new ArrayList<>();
        list.add(son);
        list.add(son1);
        list.add(son2);
        list.add(son3);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String st = mapper.writeValueAsString(list);
            System.out.println(st);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void  listTest(){

//        List<String> list = null;
//        List<String> lt = new ArrayList<>();
//        lt.add("1");
//        lt.add("2");
//        lt.add("3");
//        list.addAll(lt);
//        list.forEach(e -> System.out.println(e));

//        String str = "03";
//        String string = str.substring(1);
//        System.out.println(string);

        List<String> list = new ArrayList<>();

        if (list != null){

        }
    }

}
