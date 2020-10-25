package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhougl2
 * @create 2020-10-18-21:45
 */
public class DateTimeTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化日期
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        //解析
        String str = "2020/12/19 下午6:36";
        Date parse = sdf.parse(str);
        System.out.println(parse);

        System.out.println("*******************");
        //按照指定的格式进行格式化和解析：调用带参的构造器
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        //解析
        Date parse1 = sdf1.parse("2030-10-19 06:47:01");
        System.out.println(parse1);

    }

    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date
     */
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
//        System.out.println(date);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    //练习二：“三天打鱼，两天晒网”  1990-01-01

    @Test
    public void test2(){
        //实例化
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        //常用方法
        //get（）
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set（）
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,4);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //getTime()

        //setTime()
    }
}
