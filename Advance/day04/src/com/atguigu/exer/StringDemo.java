package com.atguigu.exer;

/**
 * @author Chris Jin
 * @create 2022-03-26 1:31 PM
 */
public class StringDemo {
    /*
    将一个字符串进行反反转,将字符串中指定部分进行反转,比如将""反转为
     */
    public String reverse(String str, int startIndex, int endIndex){
        if(str == null || str.length() == 0){
            return str;
        }
        char[] arr = str.toCharArray();
        for(int i = startIndex, j = endIndex; i < j; i++, j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public String reverse1(String str, int startIndex, int endIndex){
        if(str == null || str.length() == 0){
            return str;
        }
        StringBuilder builder = new StringBuilder(str.length());
        for (int i = 0; i <startIndex; i++) {
            builder.append(str.charAt(i));
        }
        for(int i = endIndex; i >= startIndex; i--){
            builder.append(str.charAt(i));
        }
//        builder.append(str.substring(endIndex,str.length()));
        builder.append(str.substring(endIndex+1));
        return builder.toString();
    }



}
