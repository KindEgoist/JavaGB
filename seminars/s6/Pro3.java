package org.example.seminars.s6;

import java.util.*;

/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 * Пример:
 * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * Mas2=[“qwe”,”v”]
 * Результат:
 * qwe=3
 */
public class Pro3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(List.of("qwe", "asd", "qwe", "x", "v"));
        List<String> mas2 = new ArrayList<>(List.of("qwe","v"));
        List<String> all = new ArrayList<>(mas1);
        all.addAll(mas2);

        Set<String> set = new HashSet<>(mas1);
        set.retainAll(mas2);
        Map<String, Integer> count = new HashMap<>();

        for (String i : all){
            for (String j : set){
                if(j.equals(i)){
                    count.putIfAbsent(j, 0);
                    count.put(j, count.get(j) + 1);
                }
            }
        }
        System.out.println(count);

//        for (String i : set){
//            int count = 0;
//            for (String j : all){
//                if(i.equals(j)) count++;
//            }
//            System.out.println(i + " = " + count);
//        }
    }
}
