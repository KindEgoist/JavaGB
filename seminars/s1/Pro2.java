package org.example.seminars.s1;

import java.util.Scanner;

//Дано последовательность N чисел. Найдите количество положительных чисел, после которых следует отрицательное число.
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = sc.nextInt();

        int k = 0;
        int a = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (a > 0 && b < 0){
                k++;
            }
            a = b;
        }
        System.out.println("k: " + k);
        sc.close();
    }
}
