package com.boot;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.*;
import java.io.IOException;

/**
 * @author: shangshanshan
 * @date: 2018-9-3 14:59
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerTest {

    @Test
    public void topicConsumerTest() throws JMSException, IOException {
        //创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("auto://47.106.163.144:61616");
        //创建连接
        Connection connection = connectionFactory.createConnection();
        //开启连接
        connection.start();
        //创建Session对话
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建会话目标对象(Topic或Queue)
        Topic topic = session.createTopic("wechatTest");
        //创建一个消费者
        MessageConsumer consumer = session.createDurableSubscriber(topic,"consumer1");
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if (message instanceof TextMessage){
                    TextMessage text = (TextMessage) message;
                    try {
                        System.out.println("Received message: " + text.getText()+":"+text.getStringProperty("property"));
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        System.in.read();
        consumer.close();
        session.close();
        connection.stop();
    }
}
