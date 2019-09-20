//package com.boot.template.api;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.Socket;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-18 14:36
// * @Description: TODO
// */
//public class SocketClientMain {
//
//    public static void main(String[] args) {
//
//        try {
//            //创建连接
//            Socket socket = new Socket("localhost",5200);
//            //定义输出流，想服务端发送信息
//            OutputStream ot = socket.getOutputStream();
//            ot.write("socket客户端向服务端发送数据测试".getBytes());
//            System.out.println("客户端发送消息111111");
//            ot.flush();
//            socket.shutdownOutput();
//            ot.close();
//            System.out.println("客户端发送完成222222");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
