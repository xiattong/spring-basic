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
public class Test {

    // 记录索引位运算的结果，去重用
    public static List<Integer> indexBits = new ArrayList<>();

    public static void DFS(List<Element> candidate, List<Element> elemGroup, HashSet<String> hs) {
        if (elemGroup.size() == 4) {
            String values = JSONObject.toJSONString(elemGroup.stream().map(Element::getValue).collect(Collectors.toList()));
            if (!hs.contains(values)) {
                // 去重
                int indexBit = 0;
                for(Element element : elemGroup) {
                    indexBit = indexBit | (1 << element.getSort());
                }

                if(!indexBits.contains(indexBit)) {
                    System.out.println(values);
                    hs.add(values);
                    indexBits.add(indexBit);
                }

            }
        }

        for (int i = 0; i < candidate.size(); i++) {
            List<Element> temp = new LinkedList<Element>(candidate);
            Element item = temp.remove(i);
            List<Element> newElements = new ArrayList<>();
            newElements.addAll(elemGroup);
            newElements.add(item);
            DFS(temp, newElements, hs);
        }
    }

    @Getter
    @Setter
    public static class Element {
        String value;
        int sort;

        public Element(String value, int sort) {
            this.value = value;
            this.sort = sort;
        }

    }



    public static void main(String[] args) {
        Element[] array = {
                new Element("1",0),
                new Element("2",1),
                new Element("3",2),
                new Element("4",3),
                new Element("5",4)
        };
        List<Element> list = Arrays.asList(array);
        HashSet<String> hs = new HashSet<String>();
        DFS(list, new ArrayList<>(), hs);

    }
}
