package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author Chris Jin
 * @create 2022-03-25 7:05 PM
 */
public class StringTest1 {

    /*
    编码: String 与 byte[] 之间的转换
    解码: String ---> byte[]:调用String的getBytes()

    编码: 字符串 ---> 字节 (看得懂--->看不懂的二进制数据)
    解码:编码的逆过程 字节--->字符集 (看不懂的二进制数据--->看得懂)

    说明:解码时,要求解码使用的字符集必须与编码时使用的字符集一致.
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc1234中国";
        byte[] bytes = str1.getBytes();//使用默认字符集进行转换
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集编码
        System.out.println(Arrays.toString(gbks));

        System.out.println("************************");
        String str2 = new String(bytes);//使用默认的字符集,进行解码
        System.out.println(str2);

        String str3 = new String(gbks);//出现乱码.原因:编码集和解码集不一致!
        System.out.println(str3);

        String str4 = new String(gbks,"gbk");//没有出现乱码
        System.out.println(str4);


    }
    /*
    String 与 char[] 之间的转换
    String --->char[]

     */
    @Test
    public void test2(){
        String str1 = "abc1234"; //题目: a21cb3

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
