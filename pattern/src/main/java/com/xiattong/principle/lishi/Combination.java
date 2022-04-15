package com.xiattong.principle.lishi;

import java.util.Arrays;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/5/31 20:23
 * @modified By：
 */
public class Combination {

    // 保证有序
    static int[] sourceArray = {1,1,2,4,7,7,7};

    public static void main(String[] args) {






    }

    /**
     * 这个方法假设我的条件是
     *
     * @param n 组合的个数,n一定要小于等用源数组的长度
     * @param index 组合排序后的索引
     * @return
     */
    public static int[] getNext(int n, int index) {
        // 声明返回的结果，第一个元素存储索引
        int[] resultArray = new int[n+1];
        if (n > sourceArray.length) {
            return resultArray;
        }

        // 保存一个源数组最大的组合索引数组，后面会使用到
        int[] sourceMaxIndexComb = new int[n];
        for (int i =  0 ; i< n ; i++) {
            sourceMaxIndexComb[i] = sourceArray.length - n + i ;
        }


        // 声明一个n长度的数组，这个数组用来存储组合元素在源数组中的下标
        int[] indexArray = new int[n];
        // 初始化 indexArray
        for (int i = 0 ; i < indexArray.length ; i++) {
            indexArray[i] = i;
        }

        // 记录索引
        int currentIndex = 0;
        // 循环中断的条件,也就是算到了最大的一个组合
        while(Arrays.stream(indexArray).sum() <= Arrays.stream(sourceMaxIndexComb).sum()) {
            // 先把索引记录下来
            resultArray[0] = currentIndex;
            // 接下来要：确定每个元素的索引，即 indexArray 中每个元素的值
            // **** 重点： 解决 1 分给谁的问题 ***
            // 倒序干
            for(int i = n - 1 ; i >= 0 ; i--) {
                if(indexArray[i] == sourceMaxIndexComb[i]) {
                    // 索引到达了它能够到达的最大值，则给它的前一位+1，自己则在它的前一位基础上+1
                    if(i - 1 >= 0) {
                        indexArray[i - 1] = indexArray[i - 1] + 1;
                        indexArray[i] = indexArray[i - 1] + 1;
                        break;
                    }
                } else {
                    //  索引没到达它能够到达的最大值，+1
                    indexArray[i] = indexArray[i] + 1;
                    break;
                }
            }
        }
        return resultArray;
    }
}
