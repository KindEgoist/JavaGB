package org.example.stepik;

import java.util.Scanner;

/**
 Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
 Программа получает на вход три числа: a, b, n.
 Программа должна вывести два числа: стоимость покупки в рублях и копейках.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int min1;
        int min2;
        if (m - x > x) min1 = x;
        else min1 = m - x;
        if (n - y > y) min2 = y;
        else min2 = n - y;
        if (min1 > min2) System.out.println(min2);
        else System.out.println(min1);



    }
}
