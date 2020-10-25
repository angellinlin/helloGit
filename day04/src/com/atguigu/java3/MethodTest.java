package com.atguigu.java3;

import com.atguigu.java2.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author zhougl2
 * @create 2020-10-25-11:22
 */
public class MethodTest {
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        Method[] methods = clazz.getMethods();
        for(Method m :methods){
            System.out.println(m);
        }
    }

    /*
    权限修饰符 返回值类型 方法名（参数类型1 形参名1,...） throws Exception
     */
    @Test
    public void test2(){
        Class<Person> p1 = Person.class;
        Method[] de = p1.getDeclaredMethods();
        for(Method m :de){
            Annotation[] annos = m.getAnnotations();
            for(Annotation a :annos){
                System.out.println(a);
            }

            int modifiers = m.getModifiers();
            System.out.print(Modifier.toString(modifiers)+ "\t");


            Class<?> returnType = m.getReturnType();
            System.out.print(returnType.getName() + "\t");

            System.out.print(m.getName());

            System.out.println();
        }
    }
}
