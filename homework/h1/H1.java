/**
 * Учитывая входную строку s, измените порядок слов на противоположный. Слово определяется как последовательность не
 * пробельных символов. Слова в s будут разделены хотя бы одним пробелом. Возвращает строку слов в обратном порядке,
 * объединенных одним пробелом. Обратите внимание, что s может содержать начальные или конечные пробелы или несколько
 * пробелов между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова.
 * Не включайте никаких дополнительных пробелов.
 *
 * Input: s = " the        sky  is blue   "
 * Output: "blue is sky the"
 */
package org.example.homework.h1;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = sc.nextLine();
        sc.close();

        String[] part = str.trim().split("\\s+");
        /** trim() удаляет пробелы в  начале и в конце. split() создаем
        массив строк String[]. Где аргументом для деления на элементы является \\s+ (s пробел, + больше одного)*/

        System.out.printf("Полученный массив строк: ");
        print(part);
        array(part);
        System.out.println();
        System.out.printf("Результат: ");
        print(part);
    }
    public static void print(String [] arr) { //метод печати
        for (String i : arr) {
            System.out.printf((i) + " ");
        }
    }
    public static String[] array (String [] arr){ //метод замены
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
