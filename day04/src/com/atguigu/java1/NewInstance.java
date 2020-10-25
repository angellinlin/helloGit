package com.atguigu.java1;

import org.junit.Test;

/**
 * 通过反射创建对应的运行时对象
 * @author zhougl2
 * @create 2020-10-24-22:32
 */
public class NewInstance {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class class1 = Person.class;

        //newInstance();调用此方法，创建对应的运行时类的对象
        Object obj = class1.newInstance();
        System.out.println(obj);
    }
}
