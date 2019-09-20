package com.boot.template.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/**
 * @author: shangshanshan
 * @date: 2019-1-22 10:19
 * @Description: 线程池动态定时任务
 */
@Component
public class ThreadPoolTaskSchedulerTest {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    /**
     * @author: shangshanshan
     * @description: //ThreadPoolTaskScheduler方法
     * @date: 2019-1-22 15:10
     * @param:
     * @return:
     */
//    ScheduledFuture<?> schedule(Runnable task, Trigger trigger);
//    ScheduledFuture<?> schedule(Runnable task, Date startTime);
//    ScheduledFuture<?> scheduleAtFixedRate(Runnable task, Date startTime, long period);
//    ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long period);
//    ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, Date startTime, long delay);
//    ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long delay);


    //定义线程安全map
    private static ConcurrentHashMap<String, ScheduledFuture<?>> map = new ConcurrentHashMap();
    /**
     * @author: shangshanshan
     * @description: //注入初始化线程池
     * @date: 2019-1-22 10:22
     * @param: []
     * @return: org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
     */
    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }

    /**
     * @author: shangshanshan
     * @description: //新增定时任务
     * @date: 2019-1-22 10:24
     * @param: [key, runnable, cron] key：绑定定时任务存储在map中，runnable线程任务，cron定时任务
     * @return: void
     */
    public void addScheduler(String key, Runnable runnable, String cron){
        //ScheduledFuture：定时计划  Runnable（线程接口类） 和CronTrigger（定时任务触发器）
        //调度给定的Runnable，在触发器指示下一个执行时间时调用它。
        ScheduledFuture<?> future = threadPoolTaskScheduler.schedule(runnable,new CronTrigger(cron));
        map.put(key,future);
    }


    public void addScheduler(String key, Runnable runnable, Date time){
        //调度给定的Runnable，在指定的执行时间调用它。
        ScheduledFuture<?> future = threadPoolTaskScheduler.schedule(runnable,time);
        map.put(key,future);
    }

    public void addScheduler(String key, Runnable runnable,long delay, Date time){
        //调度给定的Runnable，在指定的执行时间调用它，然后在一个执行完成到下一个执行开始之间的给定延迟调用它。 delay:延期
        ScheduledFuture<?> future = this.threadPoolTaskScheduler.scheduleWithFixedDelay(runnable,time,delay);
        map.put(key,future);
    }


    public void addScheduler(String key, Runnable runnable, Date time, long period){
        //调度给定的Runnable，在指定的执行时间调用它，然后在给定的时间段调用它。 period ： 周期
        ScheduledFuture<?> future = this.threadPoolTaskScheduler.scheduleAtFixedRate(runnable,time,period);
        map.put(key,future);
    }
    /**
     * @author: shangshanshan
     * @description: //接口调用的新增方法
     * @date: 2019-1-22 11:34
     * @param: [key, runnable, dateTime] key：绑定定时任务存储在map中，runnable线程任务，dateTime定时任务启动时间
     * @return: void
     */
    public void addScheduler(String key, Runnable runnable, LocalDateTime dateTime){
        //LocalDateTime转换为cron
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss mm HH dd MM ?");
        String cron = formatter.format(dateTime);
        //调用新增方法
        this.addScheduler(key,runnable,cron);
    }

    /**
     * @author: shangshanshan
     * @description: //删除定时任务
     * @date: 2019-1-22 11:36
     * @param: [key]
     * @return: void
     */
    public void delScheduler(String key){
        ScheduledFuture<?> future = map.get(key);
        if (future != null){
            future.cancel(true);
            map.remove(key);
        }
    }

    public void changeScheduler(String key, Runnable runnable, LocalDateTime dateTime){
        //先停止定时任务再开启定时任务时间
        ScheduledFuture<?> future = map.get(key);
        if (future!=null){
            //先停止
            delScheduler(key);
            //在开启
            addScheduler(key,runnable,dateTime);
        }
    }

    class runnable1 implements Runnable{

        @Override
        public void run() {

        }
    }
}
