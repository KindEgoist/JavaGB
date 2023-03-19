package org.example.seminars.s4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */
public class Pro3 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, 9));
        List<Integer> integerList2 = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, 9));

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0){
                integerList.remove(i);
                i --;
            }
         }
        for (int j = integerList2.size() - 1; j >= 0; j--) { //двигаемся с конца
            if (integerList2.get(j) < 0){
                integerList2.remove(j);}
        }
        System.out.println(integerList);
        System.out.println(integerList2);
    }
}
