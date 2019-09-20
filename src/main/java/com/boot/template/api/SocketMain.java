//package com.boot.template.api;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * @author: shangshanshan
// * @date: 2019-3-15 19:00
// * @Description: TODO
// */
//public class SocketMain {
//
//    public static void main(String[] args) throws IOException {
//        //监听客户端连接端口号 服务器端创建ServerSocket对象，调用accept方法返回Socket对象
//        ServerSocket serverSocket = new ServerSocket(5200);
//        //侦听并接受到此套接字的连接
//        Socket socket = serverSocket.accept();
//
//        new Runnable(){
//
//            @Override
//            public void run() {
//                //定义输入流，接受客户端信息
//                InputStream in = null;
//                try {
//                    in = socket.getInputStream();
//
//                    byte[] bytes = new byte[1024];
//                    int len = 0;
//                    ByteArrayOutputStream ot = new ByteArrayOutputStream();
//                    while ((len = in.read(bytes)) != -1){
//                        ot.write(bytes,0,len);
//                    }
//
//                    ot.close();
//                    in.close();
//                    String s = new String(ot.toByteArray(),"UTF-8");
//                    System.out.println("socket连接输出结果：" + s);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        };
//
//
//    }
//}
