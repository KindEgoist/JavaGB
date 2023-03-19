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
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();;
        System.out.println( (h - 2 * b + a - 1) / (a - b));



    }
}
