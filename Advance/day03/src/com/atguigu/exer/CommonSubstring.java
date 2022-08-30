package com.atguigu.exer;

/**
 * @author Chris Jin
 * @create 2022-03-27 10:44 AM
 */
public class CommonSubstring {
    /*
    获取两个字符串中最大相同子串
    str1 = "abcwerthelloyuiodef"; str2 = "cvhellobnm"
     */
    public String getLCS(String str1, String str2){
        String maxString = (str1.length() >= str2.length()) ? str1 : str2;
        String minString = (str1.length() < str2.length()) ? str1 : str2;
        int length = minString.length();
        for(int i = 0; i < length; i++){
            for(int x = 0, y = length - i;y <= length; x++,y++){
                String subStr = minString.substring(x,y);
                if(maxString.contains(subStr)){
                    return subStr;
                }
            }
        }

        return null;
    }
}
