package com.atguigu.java;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Chris Jin
 * @create 2022-04-17 4:42 PM
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password1");
        System.out.println("name=" + name + ", password=" + password);
    }
}
