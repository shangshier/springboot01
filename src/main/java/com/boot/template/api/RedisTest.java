//package com.boot.template.api;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.StringRedisTemplate;
//
//import java.util.List;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-24 20:07
// * @Description: TODO
// */
//public class RedisTest {
//
//    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//
//    public void main(String[] args) {
//
//        ListOperations<String,String> listVp = redisTemplate.opsForList();
//        listVp.rightPush("mydate","1");
//        listVp.rightPush("mydate","2");
//        listVp.rightPush("mydate","3");
//        listVp.rightPush("mydate","4");
//        listVp.rightPush("mydate","5");
//        listVp.rightPush("mydate","6");
//
//        List<String> list = listVp.range("mydate",0,-1);
//
//        System.out.println("redis存储结果" + list.toString());
//    }
//}
