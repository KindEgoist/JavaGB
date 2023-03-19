package org.example.seminars.s2;

import java.util.Scanner;

//2) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
// перед которыми идет четное число.
public class Pro2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите N: ");
        int n = scan.nextInt();
        int summa = 0;
        int a = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scan.nextInt();
            if (b % 10 == 5 && a % 2 == 0){
                summa += b;
            }
            a = b;
        }
        System.out.println(summa);
    }
}
