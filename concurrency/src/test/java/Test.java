import model.Animal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: xiattong
 * @Date: 2020/3/22 12:29
 */
public class  Test {
    public class Father implements Serializable {

        private static final long serialVersionUID = 5181667167312044536L;

        private Father(int a) {
            System.out.println(new Test());
            System.out.println("构造了Father");
        }

        private Father(int a, int b) {
            System.out.println("构造了Father");
        }

    }

    public class Child extends Father {
        private Child(int a) {
            super(1, 2);
            System.out.println("构造了Child");
        }

        public void fun() {
            System.out.println(new Test());
        }


    }

    public static void staticFun(){
        System.out.println("static fun");
    }

    public static void main(String[] args) {
        TreeMap<BigDecimal,String> map = new TreeMap<>();
        map.put(new BigDecimal("19"), "a");
        map.put(new BigDecimal("18"), "b");
        map.put(new BigDecimal("2"), "c");
        map.put(new BigDecimal("100000010000000.0"), "d");
        map.put(new BigDecimal("100000001000000.0"), "e");
        map.put(new BigDecimal("1000000.1"), "f");
        map.put(new BigDecimal("1000000.10"), "g");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.lastKey());
    }
}