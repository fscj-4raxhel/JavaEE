package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 其他流的使用
 * 1. 标准的输入、输出流
 * 2. 打印流
 * 3. 数据流
 * @author Chris Jin
 * @create 2022-04-25 8:52 PM
 */
public class OtherStreamTest {
    /*
    1. 标准的输入、输出流
    1.1
    System.in: 标准的输入流,默认从键盘输入
    System.out: 标准的输出流,默认从控制台输出
    1.2
    System类的setIn(InputStream) / setOut(PrintStream) 方式重新指定输入流和输出流
    1.3 练习:
    从键盘输入字符串,要求将读取到的整行字符串转换成大写输出. 然后继续进行输入操作
    直至当输入"e"或者"exit"时,退出程序

    方式一:使用Scanner实现
    方式二:使用System.in实现 ---> 转换流 ---> BufferedReader的readLine()
     */
    public static void main(String[] args){
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while(true){
                String data = br.readLine();
                if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data) ){
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*
        3. 数据流
        3.1 DataInputStream 和 DataOutputStream
        3.2 作用: 用于读取或写出基本数据类型的变量或字符串
     */
    @Test
    public void test1() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.writeUTF("刘建臣");
        dos.flush();//刷新操作,将内存中的数据写入文件
        dos.writeInt(23);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

    }
    /*
    将文件中存储的基本数据类型变量和字符串读取到内存中,保存在变量中
    注意点: 读取不同类型的数据的顺序要与当初写入文件时,保存的数据顺序一致!
     */
    @Test
    public void test2() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isBoy = dis.readBoolean();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("isBoy = " + isBoy);

    }
}
