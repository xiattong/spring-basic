package com.xiattong.principle.lishi;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/6/1 9:45
 * @modified By：
 */
public class TestPlus {

    // 记录索引位运算的结果，去重用
    public static void DFS(int num, List<Element> candidate, List<Element> elemGroup, HashSet<List<Element>> hs, List<Integer> indexBits) {
        if (elemGroup.size() == num) {
            // 去重
            int indexBit = 0;
            for(Element element : elemGroup) {
                indexBit = indexBit | (1 << element.getSort());
            }

            if(!indexBits.contains(indexBit)) {
                System.out.println(JSONObject.toJSON(elemGroup));
                hs.add(elemGroup);
                indexBits.add(indexBit);
            }

        }

        for (int i = 0; i < candidate.size(); i++) {
            List<Element> temp = new LinkedList<Element>(candidate);
            Element item = temp.remove(i);
            List<Element> newElements = new ArrayList<>();
            newElements.addAll(elemGroup);
            newElements.add(item);
            DFS(num, temp, newElements, hs, indexBits);
        }
    }

    @Getter
    @Setter
    public static class Element {
        int sort;

        public Element(int sort) {
            this.sort = sort;
        }

    }



    public static void main(String[] args) {
        Element[] array = {
                new Element(0),
                new Element(1),
                new Element(2),
                new Element(3),
                new Element(4)
        };
        List<Element> list = Arrays.asList(array);
        HashSet<List<Element>> hs = new HashSet<>();
        List<Integer> indexBits = new ArrayList<>();
        DFS(4, list, new ArrayList<>(), hs, indexBits);

    }
}
