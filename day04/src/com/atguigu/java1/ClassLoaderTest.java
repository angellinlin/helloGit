package com.atguigu.java1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * @author zhougl2
 * @create 2020-10-24-21:09
 */
public class ClassLoaderTest {
    @Test
    public void test1() throws IOException {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);



    }
    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        //此时的文件默认在当前的module下
        //读取配置文件的方式一
      /*  FileInputStream fis = new FileInputStream("jdbc.properties");
        properties.load(fis);*/


        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为当前module的src下
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = loader.getResourceAsStream("jdbc1.properties");
        properties.load(resourceAsStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(user);
        System.out.println(password);
    }
}
