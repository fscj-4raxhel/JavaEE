package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 *
 * 1. ObjectInputStream 和 ObjectOutputStream
 * 2. 作用: 用于存储和读取基本数据类型数据或对象的处理流. 可以将Java中的对象存到数据源文件中,也可以
 *          将从数据源文件读取Java对象
 *
 * 3. 要想一个Java对象是可序列化的,需要满足相应的要求. 见Person
 * @author Chris Jin
 * @create 2022-04-26 7:49 PM
 */
public class ObjectInputOutputStreamTest {
    /*
    序列化过程: 将内存中的java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作
            oos.writeObject(new Person("王力宏",54));//java.io.NotSerializableException
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    反序列化过程: 将磁盘文件中的对象还原为内存中的一个java对象
    使用ObjectInputStream来实现
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        String str = null;
        Person p = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.txt"));
            Object obj = ois.readObject();
            str = (String)obj;
            p = (Person) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(str);
        System.out.println(p);
    }

}
