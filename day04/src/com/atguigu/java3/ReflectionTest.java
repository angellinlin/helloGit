package com.atguigu.java3;

import com.atguigu.java2.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *调用运行时类中指定的结构：属性、方法、构造器
 * @author zhougl2
 * @create 2020-10-25-16:48
 */
public class ReflectionTest {
    @Test
    public void test1() throws Exception {
        Class<Person> personClass = Person.class;

        //创建运行时类的对象
        Person p = personClass.newInstance();
        //获取指定的属性
        Field id = personClass.getField("id");
        /*
        设置当前属性的值
        set():参数1：知名设置哪个对象的属性  参数2:将此属性值设置为多少
         */
        id.set(p,1001);
        /*
        获取当前属性的值
        get()
         */
        int pId= (int)id.get(p);
        System.out.println(pId);
    }

    @Test
    public void testFields() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();

        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"Tom");
        System.out.println(name.get(person));

    }

    @Test
    public void testMethod() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method show = personClass.getDeclaredMethod("show", String.class);
        /*
        invoke():参数一：方法的调用者  参数二：给方法形参赋值的实参
         */
        show.setAccessible(true);
        show.invoke(person,"CHN");

        System.out.println("**************");

        Method showDesc = personClass.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        showDesc.invoke(Person.class);

    }
}
