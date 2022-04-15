package com.xiattong.principle.lishi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/6/2 16:52
 * @modified By：
 */
public class SublistTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6);

        System.out.println(list.subList(0,3));
    }
}
