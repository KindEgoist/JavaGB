package org.example.seminars.s1;

import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String res = "";
        String str = scanner.nextLine();
        if (str.length() % 2 != 0){
            res = str.substring(str.length() / 2 + 1) + str.substring(str.length() / 2, str.length() / 2 + 1) + str.substring(0, str.length() / 2);
        } else {
            res = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);}
            // String sub1 = str.substring(0, str.length() / 2); записали в переменную суб1 с помощью substring от 0 индекса до середины введенной строки

        System.out.printf(res);
        scanner.close();
    }
}
