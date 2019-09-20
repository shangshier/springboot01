//package com.boot.template;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.Trigger;
//import org.springframework.scheduling.TriggerContext;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.scheduling.support.CronTrigger;
//import org.springframework.stereotype.Component;
//
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.ScheduledFuture;
//
///**
// * @author: shangshanshan
// * @date: 2018-9-4 18:59
// * @Description: 定时器测试
// */
//@Component
//public class ScheduledTest implements SchedulingConfigurer{
//
////    @Autowired
////    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
////
////    private ScheduledFuture<?> scheduledFuture;
////
////    @Bean
////    public ThreadPoolTaskScheduler getThreadPoolTaskScheduler() {
////        return threadPoolTaskScheduler;
////    }
//
////    @Scheduled(cron = "0 25 14 * * ?")
////    public void test(){
////        System.out.println("定时器执行++++++++");
////        int st = LocalDate.now().getDayOfWeek().getValue();
////
////    }
//
//    private static String DEFAULE_CROM = "30 * * * * ?";
//
//    private String cron = DEFAULE_CROM;
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//
//        scheduledTaskRegistrar.addTriggerTask(scheduled(),getTrigger());
//    }
//
//    private Runnable scheduled(){
//
//        return new Runnable() {
//            @Override
//            public void run() {
//                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//                LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
//                String date = dateTime.format(dateTimeFormatter);
//                System.out.println("更改时间执行" + date);
//            }
//        };
//
//    }
//
//    private Trigger getTrigger(){
//        return new Trigger() {
//            @Override
//            public Date nextExecutionTime(TriggerContext triggerContext) {
//                CronTrigger trigger = new CronTrigger(cron);
//                return trigger.nextExecutionTime(triggerContext);
//            }
//        };
//    }
//
//    public void setCron(String cron) {
//        this.cron = cron;
//    }
//
//
//}
