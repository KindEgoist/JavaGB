package org.example.homework.h5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scanner.nextLine();
        scanner.close();
        String[] lst = str.toLowerCase().replaceAll("[,;:.?!()-]", "").split("\\s+");
        Map<String, Integer> lstMap = new HashMap<>();
        for (int i = 0; i < lst.length; i++) {
            lstMap.putIfAbsent(lst[i], 0);
            lstMap.put(lst[i], lstMap.get(lst[i]) + 1);
        }
        for (var el : lstMap.entrySet()){
            System.out.print(el.getKey() + " = " + el.getValue() + "; ");
        }
    }
}
