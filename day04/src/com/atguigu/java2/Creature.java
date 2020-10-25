package com.atguigu.java2;

import java.io.Serializable;

/**
 * @author zhougl2
 * @create 2020-10-25-9:37
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
