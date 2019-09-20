//package com.boot.template.activemq;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author: shangshanshan
// * @date: 2018-10-29 14:37
// * @Description: TODO
// */
//@Component
//public class Consumer {
//
//    @JmsListener(destination = "Eaglesoul")
//    public void getTopicMessage(String text){
//
////        ObjectMapper mapper = new ObjectMapper();
//
////        try {
////            WechatPushDto dto = mapper.readValue(text,WechatPushDto.class);
////            List<String> list = new ArrayList<>();
////            list = dto.getUserFkCodes();
////            System.out.println("list:" + list.size());
////            System.out.println("name:" + dto.getName());
////            System.out.println("age:" + dto.getAge());
////            System.out.println("phone:" + dto.getPhone());
////            System.out.println("sex:" + dto.getSex());
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        System.out.println(text + ":消费者接收1111");
//    }
//}
