package com.atguigu.exer;

import org.junit.Test;

import java.lang.annotation.Target;

/**
 * @author zhougl2
 * @create 2020-10-18-17:17
 */
public class StringDemo {

    /*
    方式一：转换为char[]
     */
    public String reverse(String str,int startIndex,int endIndex){
        if(str != null && str.length() != 0){
            char[] arr = str.toCharArray();
            for(int x= startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    /*
    方式二：使用String的拼接操作
     */

    public String reverse1(String str,int startIndex,int endIndex){
       if(str != null){
           String reverseStr = str.substring(0,startIndex);
           for(int i = endIndex;i>=startIndex;i--){
               reverseStr += str.charAt(i);
           }
           reverseStr += str.substring(endIndex+1);
           return reverseStr;
       }
       return null;
    }

    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse3(String str,int startIndex,int endIndex){
       if(str != null){
           StringBuilder stringBuilder = new StringBuilder(str.length());
           stringBuilder.append(str.substring(0,startIndex));
           for(int i = endIndex;i>=startIndex;i--){
               stringBuilder.append(str.charAt(i));
           }
           stringBuilder.append(str.substring(endIndex+1));
           return stringBuilder.toString();
       }
       return null;
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse3(str, 2, 5);
        System.out.println(str);
        System.out.println(reverse);
    }

}

