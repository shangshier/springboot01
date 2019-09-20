package com.boot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: shangshanshan
 * @date: 2018-10-29 13:50
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JmsConsumer {

    @JmsListener(destination = "wechatTest")
    public void getTopicMessage(String text){

        System.out.println(text + "消费者接收");
    }
}
