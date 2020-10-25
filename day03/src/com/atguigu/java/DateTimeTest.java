package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author zhougl2
 * @create 2020-10-18-16:02
 */
public class DateTimeTest {

    //1、System类中的currentTimeMills()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        //1、构造器一：Date()
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        Date date1 = new Date(1603008749379L);
        System.out.println(date1);
    }
}
