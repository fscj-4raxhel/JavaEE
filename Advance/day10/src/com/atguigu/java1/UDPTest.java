package com.atguigu.java1;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * UDP协议的网络编程
 * @author Chris Jin
 * @create 2022-04-27 7:19 PM
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();


        String str = "Sent by UDP";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

        socket.send(packet);

        socket.close();
    }
    //接收端
    @Test
    public void receiver() throws IOException{
        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
