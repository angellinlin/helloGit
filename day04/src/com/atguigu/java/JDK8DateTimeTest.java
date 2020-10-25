package com.atguigu.java;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.SynchronousQueue;

/**
 * @author zhougl2
 * @create 2020-10-19-20:44
 */
public class JDK8DateTimeTest {
    @Test
    public void test1(){

        //now()：获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);

        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonthValue());

        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate1);
        System.out.println(localDate);
    }
}
