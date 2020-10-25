package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author zhougl2
 * @create 2020-10-17-20:27
 */
public class StringTest1 {
    /*
    String和基本数据类型、包装类之间的转换
    String-->基本数据类型、包装类
     */
    @Test
    public void test1(){
        String s1 = "123";
        int i = Integer.parseInt(s1);

        String s = String.valueOf(i);
        String str1 = i+"";
    }

    /*
    String与字符数组之间的转换
     */
    @Test
    public void test2(){
        String str1 = "abc123";
        char[] chars = str1.toCharArray();
        for (int i = 0;i<chars.length;i++){
            System.out.println(chars[i]);
//            System.out.println(chars[i]);
        }
        char[] arr = new char[]{'h','e','l','l','o'};
        String s = new String(arr);
        System.out.println(s);
    }

    /*
    Strig与字节数组之间的转换
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
//        byte[] bytes = new byte[];
        byte[] bytes = new byte[]{'a','b','v'};
        for(int i = 0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //使用gbk字符集进行编码
        /*
        编码：字符串-》字节
        解码：编码的逆过程  字节-》字符串
         */
        byte[] gbks = str1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        System.out.println("****************");

        String str4 = new String(bytes1);
        System.out.println(str4);

        String gbks1 = new String(gbks);
        System.out.println(gbks1);

        String gbk6 = new String(gbks, "gbk");
        System.out.println(gbk6);

    }


}
