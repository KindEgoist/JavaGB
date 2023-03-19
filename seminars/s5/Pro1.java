package org.example.seminars.s5;
/**
 * Посчитать количество вхождений каждого символа в текст.
 */

import java.util.HashMap;
import java.util.Map;

public class Pro1 {
    public static void main(String[] args) {
        Map<Character, Integer>  mapCh = new HashMap<>();
        String str = "qweqwwqeac vaweeda qwewdas";

        for (int i = 0; i < str.length(); i++) { //современный вариант
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
        }


//        for (int i = 0; i < str.length(); i++) { старый способ
//            if (!mapCh.containsKey(str.charAt(i))){ // есть или нет такой ключь, если нет то записываем его, если есть то else
//                mapCh.put(str.charAt(i), 1);
//            } else {
//                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            }
//        }

        System.out.println(mapCh); // печать
        for (var entry : mapCh.entrySet()){ // печать
            System.out.print(entry.getKey() + " = " + entry.getValue() + " ");
        }

    }
}
