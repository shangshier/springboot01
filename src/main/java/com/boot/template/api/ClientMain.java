//package com.boot.template.api;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.Socket;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-18 11:45
// * @Description: TODO
// */
//public class ClientMain {
//
//    public static void main(String[] args) throws IOException {
//        //创建客户端Socket,指定服务器地址和端口
//        Socket socket = new Socket("localhost",5200);
//        //定义输出流，想服务端发送信息
//        OutputStream ot = socket.getOutputStream();
//        ot.write("socket客户端向服务端发送数据测试".getBytes());
//        ot.flush();
//        socket.shutdownOutput();
//        ot.close();
//    }
//}
