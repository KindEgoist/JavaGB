package org.example.seminars.s5;

import java.util.HashMap;
import java.util.Map;

/**
 * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Pro2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        for (int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(seachDubl(arr));
    }

    private static boolean seachDubl(int[] arr) {
        Map<Integer, Integer> testMap = new HashMap<>();

        for (int e : arr){
           testMap.put(e, 1);
        }
        return (testMap.size() != arr.length);

//        for (int e : arr){
//            if (testMap.containsKey(e)) return true;
//            else testMap.put(e, 1);
//        }
//        for (int e : arr) {
//            testMap.putIfAbsent(e, 0);
//            testMap.put(e, testMap.get(e));
//        }
//        for (var el : testMap.values()) {
//            if (el != 0) return true;}
//
//        return false; //1
//        return false; //2
    }
}
