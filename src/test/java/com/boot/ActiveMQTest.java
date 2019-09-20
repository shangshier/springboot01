package com.boot;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.*;

/**
 * @author: shangshanshan
 * @date: 2018-9-3 11:07
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ActiveMQTest {

    public void topicProducerTest() throws JMSException {

        //创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        //创建连接
        Connection connection = connectionFactory.createConnection();
        //开启连接
        connection.start();
        //创建Session对话
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建会话目标对象(Topic或Queue)
        Topic topic = session.createTopic("Topic01");
        //创建一个生产者
        MessageProducer producer = session.createProducer(topic);
        //创建消息体
        TextMessage message = session.createTextMessage("123木头人");
        //发送消息
        producer.send(message);

        //关闭资源
        producer.close();
        session.close();
        connection.close();

    }
}
