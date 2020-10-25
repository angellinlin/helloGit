package com.atguigu.java;

import org.junit.Test;

/**
 * 关于StringBuffer和StringBuilder的使用
 * @author zhougl2
 * @create 2020-10-18-9:55
 */
public class StringBufferBuilderTest {

    /*
    Sting、StringBuffer、StringBuilder三者的异同
     */
    @Test
    public void test(){

        StringBuffer sb1 = new StringBuffer();
        sb1.setCharAt(0,'m');


        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length());

    }

    /*
    StringBuffer的常用方法
     */
    @Test
    public void test2(){
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append(1);
        stringBuffer.append('1');
        System.out.println(stringBuffer);
//        stringBuffer.delete(3,5);
//        System.out.println(stringBuffer);

//        stringBuffer.replace(2,4,"中国");
//        System.out.println(stringBuffer);

//        stringBuffer.insert(2,false);
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.length());

        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);

        String s2 = stringBuffer.substring(1,3);
        System.out.println(s2);
    }
}
