package com.boot.template.threadscheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: shangshanshan
 * @date: 2019-6-21 15:57
 * @Description: TODO
 */
@Component
public class SchedulerConfig {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    //定义一个递增常量
    private static int i = 1;
    @Bean
    public ThreadPoolTaskScheduler schedulerThread(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(10);
        return scheduler;
    }

    public Runnable runnable(){

        Runnable runnable = () -> {

            System.out.println("线程执行第" + i++ + "次");
        };

        return runnable;
    }


    public void runThreadTask(){

        Date date = new Date();

        threadPoolTaskScheduler.scheduleWithFixedDelay(runnable(), date, 5);

    }

    public void scheduleAtFixeRateTest(){

        threadPoolTaskScheduler.scheduleAtFixedRate(runnable(),5000);
    }
}
