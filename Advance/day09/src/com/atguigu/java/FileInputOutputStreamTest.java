package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试FileInputStream和FileOutputStream的使用
 *
 * 结论:
 * 1. 对于文本文件(.txt,.java,.c,.cpp), 使用字符流处理
 * 2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...),使用字节流处理
 * @author Chris Jin
 * @create 2022-04-23 5:32 PM
 */
public class FileInputOutputStreamTest {
    //使用字节流处理非文本文件是可能会出席建乱码的
    @Test
    public void testFileInputStream() throws IOException {
        //1. 造文件
        File file = new File("hello.txt");

        //2. 造流
        FileInputStream fis = new FileInputStream(file);

        //3. 读数据
        byte[] buffer = new byte[5];
        int len;
        while((len = fis.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }

        //4.
        fis.close();


    }
    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 造文件
            File srcFile = new File("02.JPG");
            File destFile = new File("02_copy.JPG");
            //2. 造流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
