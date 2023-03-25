package org.example.seminars.s6;

import java.util.*;

/**
 * 1) Дан массив чисел, посчитать процент уникальных чисел.
 * *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Pro1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
        Set<Integer> set = new HashSet<>(array);
        double x = (set.size() * 100) / array.size();
        System.out.println(x);
    }
}
