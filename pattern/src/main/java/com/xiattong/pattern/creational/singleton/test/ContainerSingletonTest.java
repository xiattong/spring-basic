package com.xiattong.pattern.creational.singleton.test;

import com.xiattong.pattern.creational.singleton.register.ContainerSingleton;

/**
 * Created by Tom.
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
