package com.atguigu.java;

import org.junit.Test;

/**
 * String的使用
 * @author zhougl2
 * @create 2020-10-15-20:05
 */
public class StringTest {
    @Test
    public void test1(){
        /*
        String :字符串，使用一对“”引起来表示
        1、String声明为final的，不可被继承
        2、String实现了Serializable接口：表示字符串支持序列化，
        实现了comparable接口：表示String可以比较大小
        3、String在内部定义了final char[] value用于存储字符串数据
        4、Sting代表一个不可变的字符序列，简称：不可变性
         */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        s1 = "hello";
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**********************");
        String s3 = "abc";
        s3 +="def";
        System.out.println(s3);
        System.out.println(s2);;

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);

    }

    @Test
    public void test2(){
        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("************************");
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
    }
}
