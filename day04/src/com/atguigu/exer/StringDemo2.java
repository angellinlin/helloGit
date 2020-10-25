package com.atguigu.exer;

import org.junit.Test;

/**
 * @author zhougl2
 * @create 2020-10-18-20:26
 */
public class StringDemo2 {
    public String getMaxSameString(String str1,String str2){
       if(str1 != null && str2 != null){
           String maxStr = (str1.length()>=str2.length())? str1:str2;
           String minStr = (str1.length()<str2.length())? str1:str2;

           int length = minStr.length();
           for(int i =0;i<length;i++){
               for(int x = 0,y = length-i;y<=length;x++,y++){
                   String subStr = minStr.substring(x,y);
                   if(maxStr.contains(subStr)){
                       return subStr;
                   }
               }

           }
       }
        return null;
    }

    @Test
    public void test1(){
        String str1 = "abcwerthello1yuiodefabcdef";
        String  str2 = "cvhello1bnmabcdef";
        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }


}
