package org.example.seminars.s2;

import java.util.Scanner;

// Реализуйте функцию pow(x, n), которая вычисляет x в степени n (т. е. xn)
public class Pro1 {
    public static void main(String[] args) {
        System.out.printf("Введите X: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.printf("Введите N: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println(stepin(x, n));
    }
    public static double stepin(double x, int n){
        double step = 1.0;
        if (n < 0){
            x = 1 / x;
            n = -n;
        }
        for (int i = 0; i < n; i++) {
            step *= x;
        }

        return step;

    }
}
