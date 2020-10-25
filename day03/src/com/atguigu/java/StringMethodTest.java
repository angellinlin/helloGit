package com.atguigu.java;

import jdk.jfr.Registered;
import org.junit.Test;

/**
 * @author zhougl2
 * @create 2020-10-17-16:53
 */
public class StringMethodTest {

    @Test
    public void test1(){
        String s1 = "helloworld";
        System.out.println(s1.length());
//        System.exit(-1);
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        System.out.println(s1.charAt(7));
//        s1 = "";
        System.out.println(s1.isEmpty());
        String s2 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "   he  llo   wor  ls     ";
        String  s4 = s3.trim();
        System.out.println("********" + s3 +"*******");
        System.out.println("********" + s4 +"*******");


    }

    @Test
    public void test2(){
        String s1 = "HELLOWORLD";
        String s2 = "helloworld";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "avbc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 =new String("abe");
        System.out.println(s5.compareTo(s6));

        String s7 = "北京尚硅谷教育";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(2,5);
        System.out.println(s9);
    }

    @Test
    public void test3(){
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("Hell");
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll", 2);
        System.out.println(b3);

        String str2 = "Wo";
        System.out.println(str1.contains(str2));
        System.out.println(str1.indexOf("lol"));

        System.out.println(str1.indexOf("lo",5));

        String str3 = "hellorworld";
        System.out.println(str3.lastIndexOf("or",6));
    }


    @Test
    public void test4(){
        String str1 = "北京尚硅谷教育北京";
        String str2 = str1.replace('北','东');
        System.out.println(str2);

        String str3 = str1.replace("北京","上海");
        System.out.println(str3);

        System.out.println("**************");

        String str = "23hello2335world3466java94989mysql3758";
        String string = str.replaceAll("\\d+",",");
        System.out.println(string);

        str = "123345";
        boolean matches = str.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-45300004289";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);


    }


}
