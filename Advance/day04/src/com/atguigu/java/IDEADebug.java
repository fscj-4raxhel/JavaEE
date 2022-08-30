package com.atguigu.java;

import org.junit.Test;

/**
 * @author Chris Jin
 * @create 2022-03-26 8:46 PM
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//null "null"

        StringBuffer sb1 = new StringBuffer(str);//抛异常
        System.out.println(sb1);//
    }
}
