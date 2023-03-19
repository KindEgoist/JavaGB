package org.example.homework.h2;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class H1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = scan.nextInt();
        System.out.println("Cумма простых чисел = " + sumOfPrimeNumbers(n));
        scan.close();
    }

    /**
     *
     * @param n последовательность N целых чисел
     * @return сумма простых чисел
     */
    public static int sumOfPrimeNumbers(int n){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if (primeNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }
    /**
     * Проверяем, данное число простое или нет
     * @param num число на проверку простого
     * @return простое или не простое(true\false)
     */
    public static boolean primeNumber(int num) {
        Double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}
