package org.example.seminars.s1;

import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int [] res = new int[n];
        res[0] = array[0];
        for (int i = 0; i < array.length; i++) {
            res[i] = res[i - 1] + array[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(" "+res[i]);
        }
    }
}
