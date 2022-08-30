package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile的使用
 * 1. RandomAccessFile直接继承与java.lang.Object类,实现了DataInputDataOutput接口
 * 2. RandomAccessFile即可以作为一个数据流,又可以作为一个输出流
 *
 * 3. 如果RandomAccessFile作为输出流是,写出到的文件不存在,则在执行过程中自动创建
 *      如果写出到的文件,则会对原有文件内容进行覆盖.(默认情况下从头覆盖)
 * 4. 可以通过相关的操作,实现RandomAccessFile实现插入的效果
 * @author Chris Jin
 * @create 2022-04-26 8:16 PM
 */
public class RandomAccessFileTest {
    @Test
    public void test1(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("dbcp.txt"),"r");
            raf2 = new RandomAccessFile(new File("dbcp1.txt"),"rw");
            byte[] buffer = new byte[1024];
            int len;
            while((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置
        raf1.write("xyz".getBytes());

        raf1.close();
    }
    /*
    使用RandomAccessFile实现数据的插入效果
     */
    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);
        StringBuilder sb = new StringBuilder((int)new File("hello.txt").length());
        byte[] buffer = new byte[1024];
        int len;
        while((len = raf1.read(buffer)) != -1 ){
            sb.append(new String(buffer,0,len));
        }
        raf1.seek(3);
        raf1.write("xyz".getBytes());
        raf1.write(new String(sb).getBytes());
        raf1.close();

    }
}
