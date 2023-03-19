package org.example.seminars.s1;
/** Найти разницу между произведением цифр числа и суммы цифр числа
 */
import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = scanner.nextInt();
        scanner.close();
        System.out.printf("Результат: %d", rezalt(x));
    }
    public static int rezalt(int x){
        int summa = 0, proiz = 1;
        while (x != 0){
            summa += x % 10;
            proiz *= x % 10;
            x = x / 10;
        }
        return proiz - summa;
    }
}