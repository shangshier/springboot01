package com.boot.template.threadscheduler;

import com.boot.Springboot01Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: shangshanshan
 * @date: 2019-6-21 16:12
 * @Description: TODO
 */
public class ThreadSchedulerMain {


    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        System.out.println(ScanConfig.class);
//        SchedulerConfig config = context.getBean(SchedulerConfig.class);
//        config.runThreadTask();

    }
}
