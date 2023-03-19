package org.example.homework.h5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно.
 */
public class Pro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scanner.nextLine();
        System.out.print("Введите искомое слово: ");
        String slovo = scanner.nextLine().toLowerCase();
        scanner.close();
        String[] lst = str.toLowerCase().replaceAll("[,;:.?!()-]", "").split("\\s+");
        Map<String, Integer> lstMap = new HashMap<>();
        lstMap.put(slovo, 0);
        for (int i = 0; i < lst.length; i++) {
            if(lstMap.containsKey(lst[i])){
                lstMap.put(lst[i], lstMap.get(lst[i]) + 1);
            }
        }
        for (var el : lstMap.entrySet()){
            System.out.print(el.getKey() + " = " + el.getValue());
        }

    }
}
