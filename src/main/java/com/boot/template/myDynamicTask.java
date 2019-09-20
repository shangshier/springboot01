package com.boot.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author: shangshanshan
 * @date: 2018-9-10 17:36
 * @Description: 定时器
 */
//@Component
//public class myDynamicTask {
//
//    @Autowired
//    private ScheduledTest test;
//
//    @Scheduled(cron = "0 48 15 * * ?")
//    public void scheduled(){
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
//        String date = dateTime.format(dateTimeFormatter);
//        System.out.println("定时任务执行时间" + date);
//        test.setCron("0/1 * * * * ?");
//    }
//
//}
