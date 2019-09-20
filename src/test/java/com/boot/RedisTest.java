package com.boot;

import com.boot.template.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: shangshanshan
 * @date: 2019-3-24 20:02
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisList(){
        ListOperations<String,String> listVp = redisTemplate.opsForList();
        listVp.rightPush("mydate","1");
        listVp.rightPush("mydate","2");
        listVp.rightPush("mydate","3");
        listVp.rightPush("mydate","4");
        listVp.rightPush("mydate","5");
        listVp.rightPush("mydate","6");

        List<String> list = listVp.range("mydate",0,-1);

        System.out.println("redis存储结果" + list.toString());


    }

    @Test
    public void delRedisList(){

    }

    @Test
    public void test(){
        List<User> users = new ArrayList<>();
        users.add(new User("1","张三","24","男","123"));
        users.add(new User("2","李四","25","男","1234"));
        users.add(new User("3","王五","26","男","1223"));
        users.add(new User("4","赵六","27","女","12367"));
        users.add(new User("5","孙琦","22","男","1235"));
        users.add(new User("6","张三","24","男","123"));
        users.add(new User("7","张四","23","女","1233"));
        users.add(new User("8","张三","24","男","123"));
        users.add(new User("9","张三","24","男","123"));

        //取重复值
        List<User> list = users.stream().collect(Collectors.groupingBy(p ->p,Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()>1)
                .map(entry ->entry.getKey())
                .collect(Collectors.toList());

        list.forEach(e -> System.out.println(e.toString()));

        List<User> lt = new ArrayList<>();

        users.forEach(e ->{
            if (list.contains(e)){
                lt.add(e);
            }
        });

        lt.forEach(e -> System.out.println(e.toString()));

    }


}
