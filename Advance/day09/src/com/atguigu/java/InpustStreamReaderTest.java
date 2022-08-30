package com.atguigu.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 处理流之二: 转换流的使用
 * 1. 转换流: 属于字符流、处理流
 *      InputStreamReader: 将一个字节的输入流转换为字符的输入流
 *      OutputStreamWriter: 将一个字符的输出流转换为字节的输出流
 *
 * 2. 作用: 提供字节流与字符流之间转换
 *
 * 3. 解码: 字节、字节数组 --->字符数组、字符串
 *      编码: 字符数组、字符串 ---> 字节、字节数组
 *
 * 4. 字符集
 *
 * @author Chris Jin
 * @create 2022-04-23 10:02 PM
 */
public class InpustStreamReaderTest {

    @Test
    public void test1(){
        InputStreamReader isr = null;//使用UTF-8
        try {
            FileInputStream fis = new FileInputStream("dbcp.txt");
//        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
            //参数2指明了字符集,具体使用哪个字符集,取决于文件dbcp.txt保存是使用的字符集
            isr = new InputStreamReader(fis,"UTF-8");
            char[] cbuf = new char[100];
            int len;
            while((len = isr.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
        综合使用InputStreamReader和OutputStreamWriter
     */

}
