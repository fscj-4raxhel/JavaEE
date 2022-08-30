package com.atguigu.java1;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题2: 客户端发送文件给 服务端， 服务端将文件保存在本地。
 * @author Chris Jin
 * @create 2022-04-27 4:43 PM
 */
public class TCPTest2 {
    @Test
    public void client(){
        OutputStream os = null;

        try {
            //1. 创建Socket
            Socket socket = new Socket(InetAddress.getLocalHost(),8899);
            //2. 获取输出流
            os = socket.getOutputStream();
            //3. 写出数据
            os.write("你好,我是你二大爷".getBytes());
            //4. 关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //1. 创建ServerSocket对象
            ss = new ServerSocket(8899);
            //2. 调用accept()表示接受来自于客户端的socket
            socket = ss.accept();
            //3. 创建输入输出流
            is = socket.getInputStream();
            fos = new FileOutputStream("from_client.txt");
            //4. 写数据
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭资源
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if( ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
