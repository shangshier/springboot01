package com.boot;

import com.boot.template.threadscheduler.SchedulerConfig;
import com.boot.template.util.ThreadPoolTaskSchedulerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author: shangshanshan
 * @date: 2019-1-22 11:48
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadPoolTaskSchedulerResultTest {

    @Autowired
    private ThreadPoolTaskSchedulerTest schedulerTest;

    @Autowired
    private SchedulerConfig config;

    private static LocalDateTime time = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());


    @Test
    public void schedulerTest(){
        schedulerTest.addScheduler("123",runnable,time.plus(1, ChronoUnit.MINUTES));
    }



    //实现Runable方法
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {

            System.out.println("定时任务启动" + time);
        }
    };


    @Test
    public void LocalDateTimeToString(){
        LocalDateTime time = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss mm HH dd MM ? yyyy");
        String ts = time.plusMinutes(30).format(formatter);
        String tm = formatter.format(time);
        String tl = time.plus(10,ChronoUnit.SECONDS).format(formatter);
        System.out.println(ts);
        System.out.println(tm);
        System.out.println(tl);
    }

    class Runnable1 implements Runnable {

        @Override
        public void run() {

        }
    }

    @Test
    public void runThread(){
        config.runThreadTask();
    }
}
