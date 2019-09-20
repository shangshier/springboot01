package com.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.*;

/**
 * @author: shangshanshan
 * @date: 2018-9-12 10:48
 * @Description: 递归测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RecursionTest {

//    @Test
//    public static void main(String[] args) {
//
//        int result = getNum(10);
//        System.out.println(result);
//    }

    @Test
    public void recursionTest(){
        //计算10以内的所有数值的和
        int result = getNum(10);
        System.out.println(result);
    }

    public static int getNum(int num){
        if (num == 0){
            return 0;
        } else {
            return num + getNum(num -1);
        }
    }

    /**
     * @author: shangshanshan
     * @description: //递归获取文件夹中有那些文件
     * @date: 2018-9-12 13:48
     * @param: []
     * @return: void
     */
    @Test
    public void test(){
        List<File> list = getFiles(new File("C:\\Users\\shangshanshan\\Desktop\\智能云平台PC1"));
        System.out.println(list.size());
        for (File f : list){
            System.out.println(f.getName());
        }
    }

    public static List<File> getFiles(File files){

        List<File> fileList = new ArrayList<>();
        if (files.isDirectory()){
            for (File file : files.listFiles()){
                fileList.addAll(getFiles(file));
            }
        } else {
            fileList.add(files);
        }

        return fileList;
    }

    @Test
    public void scheduleTest(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务");
            }
        };
        Timer timer = new Timer();
        long cTime = System.currentTimeMillis() + 1 * 60 * 1000;
        Date date = new Date(cTime);
        timer.scheduleAtFixedRate(task,date,3);
    }
}
