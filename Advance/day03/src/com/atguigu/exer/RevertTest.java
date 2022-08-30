package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Chris Jin
 * @create 2022-03-25 8:42 PM
 */
public class RevertTest {

    @Test
    public void revertSubstringTest(){
        String str = "abcdefg";
        System.out.println(revertSubstring(str,3,4));
    }

    private String revertSubstring(String str, int startIndex, int endIndex){
        char[] val = str.toCharArray();

        if(startIndex < 0){
            throw new StringIndexOutOfBoundsException(startIndex);
        }
        if(endIndex > val.length){
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int length =  endIndex - startIndex - 1;
        if(length < 0){
            throw new StringIndexOutOfBoundsException(startIndex - endIndex);
        }
        char temp;
        for(int i = 0; i <= length / 2; i++){
            temp = val[startIndex+i];
            val[startIndex+i] = val[endIndex - i - 1];
            val[endIndex - i - 1] = temp;
        }
        return new String(val);
    }
}
