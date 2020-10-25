package com.atguigu.java3;

import com.atguigu.java2.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author zhougl2
 * @create 2020-10-25-16:21
 */
public class OtherTest {
    /*
    获取构造器结构
     */
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;
        //当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor c :constructors){
            System.out.println(c);
        }

        System.out.println();


        //getDeclaredConstructors():获取当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor c :declaredConstructors){
            System.out.println(c);
        }
    }

    /*
    获取运行时类的父类
     */
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);
    }

    /*
    获取运行时父类带泛型的父类
     */
    @Test
    public void test3(){
        Class<Person> personClass = Person.class;
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    /*
获取运行时父类的父类带有的泛型
 */
    @Test
    public void test4(){
        Class<Person> personClass = Person.class;

        Type genericSuperclass = personClass.getGenericSuperclass();
        ParameterizedType paraType = (ParameterizedType) genericSuperclass;

        //获取泛型类型
        Type[] actualTypeArguments = paraType.getActualTypeArguments();
        System.out.println(((Class)actualTypeArguments[0]).getName());


    }


}
