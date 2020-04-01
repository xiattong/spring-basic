package com.xiattong.pattern.creational.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 * Created by Tom.
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){
        Object instance = null;
        //下一行代码存在线程安全问题。
        //当多线程同时实列化同名的className对象时，存在条件竞争漏洞。
        //会导致A线程实列化的className实例被线程B覆盖
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className, instance);
            }catch (Exception e){
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }

}
