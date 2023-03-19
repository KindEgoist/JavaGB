package org.example.homework.h2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class H2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = scan.nextInt();
        System.out.println("Последовательность: " + ascendingSequence(n));
        scan.close();
    }

    /**
     * Проверка на возрастание
     * @param n последовательность N целых чисел
     * @return возврастающая или нет (true\false)
     */
    private static boolean ascendingSequence(int n) {
        Scanner scan = new Scanner(System.in);
        int startNumber = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int lastNumber = scan.nextInt();
            if (lastNumber < startNumber){
                return false;
            }
            startNumber = lastNumber;
        }
        return true;
    }
}
