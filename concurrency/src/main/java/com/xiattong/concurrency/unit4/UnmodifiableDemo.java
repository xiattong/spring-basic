package com.xiattong.concurrency.unit4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiattong
 * @Date: 2020/3/3 14:26
 */
public class UnmodifiableDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.name = "demo";
        Map<String,Demo> map = new HashMap<String,Demo>();
        map.put("a",demo);

        Map<String,Demo> umModifiableMap = Collections.unmodifiableMap(map);
        System.out.println(map == umModifiableMap);
        System.out.println(umModifiableMap);
        //umModifiableMap.put("a","bbbb");
        Demo unDemo = umModifiableMap.get("a");
        unDemo.name = "bbb";
        System.out.println(umModifiableMap);
    }

}
