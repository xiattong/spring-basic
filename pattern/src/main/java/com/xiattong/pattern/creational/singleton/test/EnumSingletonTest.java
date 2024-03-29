package com.xiattong.pattern.creational.singleton.test;

import com.xiattong.pattern.creational.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * Created by Tom.
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        EnumSingleton enumSingleton = EnumSingleton.valueOf("INSTANCE_B");
        System.out.println(enumSingleton == instance);

        try {
            Class clazz = EnumSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
//            System.out.println(c);
            Object o = c.newInstance();
//            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
