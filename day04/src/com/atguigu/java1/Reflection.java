package com.atguigu.java1;

import org.junit.Test;

/**
 * @author zhougl2
 * @create 2020-10-24-20:10
 */
public class Reflection {
    /*
    获取Class实例的方法
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性，.class
        Class class1 = Person.class;
        System.out.println(class1);

        //方式二：通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class<? extends Person> class2 = p1.getClass();
        System.out.println(class2);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class<?> class3 = Class.forName("com.atguigu.java1.Person");
        System.out.println(class3);

        //方法四：使用类的加载器：ClassLoader（了解）
        ClassLoader classLoader = Reflection.class.getClassLoader();
        Class<?> class4 = classLoader.loadClass("com.atguigu.java1.Person");
        System.out.println(class4);
        System.out.println(class1 == class4);


    }
}
