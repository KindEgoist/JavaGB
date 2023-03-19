package org.example.seminars.s5;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать перевод их Римских цифр в арабские:
 */
public class Pro3 {
    public static void main(String[] args) {
        Map<Character, Integer> transMap = new HashMap<>();
        transMap.put('I', 1);
        transMap.put('V', 5);
        transMap.put('X', 10);
        transMap.put('L', 50);
        transMap.put('C', 100);
        transMap.put('D', 500);
        transMap.put('M', 1000);

        String s1 = "XLVIII";
        int sum = transMap.get(s1.charAt(s1.length() - 1));
        for (int i = 0; i < s1.length() - 1; i++) {
            if (transMap.get(s1.charAt(i)) < transMap.get(s1.charAt(i + 1))){
                sum -= transMap.get(s1.charAt(i));
            } else sum += transMap.get(s1.charAt(i));

        }
        System.out.println(sum);

    }
}
