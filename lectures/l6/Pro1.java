package org.example.lectures.l6;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
 * Колекции, содержащие уникальные элементы.
 * Быстрая работа с данными.
 * "Основан" на Map'ах без пары.
 * Порядок добавления не хранится.
 */

public class Pro1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); //true
        set.add(null);
        System.out.println(set.size());//5
        System.out.println(set);//[null, 1, 12, 123, 1234]
        set.remove(12);
        for (var item : set) System.out.println(item);// null 1 1234 123
        set.clear();
        System.out.println(set); // []
    }
}
