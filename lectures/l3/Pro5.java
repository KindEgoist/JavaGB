package org.example.lectures.l3;

import java.util.ArrayList;
import java.util.List;

public class Pro5 {
    public static void main(String[] args) {
        Character value = null;
//        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y'); // List.of не даст удалить элемент
        List<Character> list1 = new ArrayList<>() ;
        list1.add('S');
        list1.add('e');
        list1.add('r');
        System.out.println(list1);
        list1.remove(1); // удаление элемента по индексу
        // java.lang.UnsupportedOperationException
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
    }
}
