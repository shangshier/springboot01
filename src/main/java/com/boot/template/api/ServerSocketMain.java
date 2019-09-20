//package com.boot.template.api;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.swing.*;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-18 13:47
// * @Description: TODO
// */
//@Component
//public class ServerSocketMain {
//
//    private static ServerSocket serverSocket;
//
//    @PostConstruct
//    public void socketTest() {
//        try {
//            System.out.println("1111111111");
//            //创建被监听的端口号
//            serverSocket = new ServerSocket(5200);
//            //客户端未连接时阻塞，并返回一个Socket对象
//            Socket socket = serverSocket.accept();
//
//            //定义输入流接收客户端消息
//            InputStream in = socket.getInputStream();
//            //定义byte[]数组 把输入流转换为String字符串
//            byte[] bytes = new byte[1024];
//            //定义字节长度
//            int len = 0;
//            //定义数组字节输入流
//            ByteArrayOutputStream os = new ByteArrayOutputStream();
//            //转换
//            while ((len = in.read(bytes)) != -1) {
//                os.write(bytes,0,len);
//            }
//            in.close();
//            os.close();
//            //转换为String字符串
//            String st = new String(os.toByteArray(),"UTF-8");
//            //打印输出结果
//            System.out.println("输出客户端结果：" + st);
//
//            JOptionPane.showMessageDialog(null,"有客户端连接到本机的5200端口");
//            System.out.println("客户端连接成功并结束");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
