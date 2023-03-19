package org.example.lectures.l5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap
 * "Старший брат" коллекции HashMap, который все помнит...
 * ПОмнит порядок добавления элементов - > более медлительный
 */
public class Pro5 {
    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11,"один один");
        linkmap.put(1,"два");
        linkmap.put(2, "один");
        System.out.println(linkmap);
        Map<Integer, String> map = new HashMap<>();// {11=один один, 1=два, 2=один}
        map.put(11,"один один");
        map.put(1,"два");
        map.put(2, "один");
        System.out.println(map); // {1=два, 2=один, 11=один один}
    }
}
