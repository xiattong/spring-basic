package com.xiattong.pattern.creational.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 * Created by Tom.
 */
public class ContainerSafeSingleton {

    private ContainerSafeSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            synchronized (ioc) {
                if(!ioc.containsKey(className)) {
                    try {
                        instance = Class.forName(className).newInstance();
                        ioc.put(className, instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}