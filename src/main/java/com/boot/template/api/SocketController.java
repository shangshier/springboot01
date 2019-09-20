package com.boot.template.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: shangshanshan
 * @date: 2019-3-15 17:30
 * @Description: TODO
 */

@RestController
@RequestMapping("/socket/test")
public class SocketController {

    @GetMapping("/client")
    public void socketClient() {

        try {
            //创建连接
            Socket socket = new Socket("localhost",5200);
            //定义输出流，想服务端发送信息
            OutputStream ot = socket.getOutputStream();
            ot.write("socket客户端向服务端发送数据测试".getBytes());
            System.out.println("客户端发送消息111111");
            ot.flush();
            socket.shutdownOutput();
            ot.close();
            System.out.println("客户端发送完成222222");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //创建客户端Socket,指定服务器地址和端口
//        Socket socket = new Socket("localhost",5200);
//        //定义输出流，想服务端发送信息
//        OutputStream ot = socket.getOutputStream();
//        ot.write("socket客户端向服务端发送数据测试".getBytes());
//        ot.flush();
//        socket.shutdownOutput();
//        ot.close();

    }


////    @GetMapping("/server")
////    public void socketServer() throws IOException {
////        //监听客户端连接端口号 服务器端创建ServerSocket对象，调用accept方法返回Socket对象
////        ServerSocket serverSocket = new ServerSocket(8082);
////        //侦听并接受到此套接字的连接
////        Socket socket = serverSocket.accept();
////        //定义输入流，接受客户端信息
////        InputStream in = socket.getInputStream();
////        byte[] bytes = new byte[1024];
////        int len = 0;
////        ByteArrayOutputStream ot = new ByteArrayOutputStream();
////        while ((len = in.read(bytes)) != -1){
////            ot.write(bytes,0,len);
////        }
////
////        ot.close();
////        in.close();
////        String s = new String(ot.toByteArray(),"UTF-8");
////        System.out.println("socket连接输出结果：" + s);
////    }
}
