package com.boot.template.activemq;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * @author: shangshanshan
 * @date: 2018-11-13 17:18
 * @Description: TODO
 */

@RestController
@RequestMapping("/activemq")
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/producer")
    public void producerSend() {
        String topicName = "Eaglesoul";
        Destination destination = new ActiveMQTopic(topicName);
        this.jmsMessagingTemplate.convertAndSend(destination,"1234567898");
        System.out.println("消息发送");
    }

}
