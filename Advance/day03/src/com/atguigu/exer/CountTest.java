package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Chris Jin
 * @create 2022-03-25 8:58 PM
 */
public class CountTest {

    @Test
    public void countTest(){
        String str = "abkkcadkabkebfkabkskab";
        System.out.println(count(str,"ab"));
    }

    private int count(String source, String target){
        int count = 0;
        int index = source.lastIndexOf(target);

        while(index >= 0){
            count++;
            if(index == 0){
                break;
            }
            index = source.lastIndexOf(target,index - 1);
        }

        return count;

    }
}
