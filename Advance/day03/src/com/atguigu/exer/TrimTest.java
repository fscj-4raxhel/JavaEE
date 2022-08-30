package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Chris Jin
 * @create 2022-03-25 8:09 PM
 */
public class TrimTest {
    @Test
    public void test1(){
        int i = ' ';
        System.out.println(i);
    }

    @Test
    public void trimTest(){
        System.out.println(trim("  a  asdf    "));
    }

    private String trim(String str){
        char[] val = str.toCharArray();
        int st = 0;
        int length = val.length;
        while(st < length && val[st] <= ' '){
            st++;
        }
        while(st < length && val[length - 1] <= ' '){
            length--;
        }

        System.out.println(st);
        System.out.println(length);
        return ((st>0) || (length<val.length))?str.substring(st,length):str;
    }

}
