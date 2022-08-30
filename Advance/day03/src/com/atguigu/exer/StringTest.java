package com.atguigu.exer;

/**
 * @author Chris Jin
 * @create 2022-03-25 10:44 AM
 */
public class StringTest {
    String str = new String("good");
    final char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {

        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);


        System.out.print(ex.str + " and ");//good and best
        System.out.println(ex.ch);
    }
}
