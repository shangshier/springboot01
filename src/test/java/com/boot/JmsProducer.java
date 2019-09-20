package com.boot;

import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.jms.Destination;

/**
 * @author: shangshanshan
 * @date: 2018-10-29 13:46
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JmsProducer {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    @Test
    public void producer(){
        Destination destination = new ActiveMQTopic("wechatTest");
        this.jmsTemplate.convertAndSend(destination,"213456");

    }

}
