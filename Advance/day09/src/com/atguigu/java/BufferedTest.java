package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 处理流之一: 缓冲流的作用
 *
 * 1. 缓冲流:
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2. 作用: 提升流的读取、写入的速度
 *      提高的原因,内部提供了一个缓冲区

 * 3. 处理流,就是套接在已有的流的基础上
 * @author Chris Jin
 * @create 2022-04-23 5:54 PM
 */
public class BufferedTest {
    /*
    实现非文本文件的复制
     */
    @Test
    public void BufferedStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 造文件
            File srcFile = new File("02.JPG");
            File destFile = new File("02_copy.JPG");

            //2. 造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.1 造缓冲流流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3. 复制的细节:
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭:
            //要求: 先关闭外层的流,再关闭内层的流
            if(bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //说明: 在关闭外层流的同时,内层流也会自动的进行关闭.关于内层流的关闭,我们可以省略
//        fos.close();
//        fis.close();
    }
    @Test
    public void testBufferedReaderBufferedWrite(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp_copy.txt")));

            //读写操作
            char[] cbuf = new char[1024];
            int len;
            while((len = br.read(cbuf)) != -1 ){
                bw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
