package org.example.homework.h2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class H3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        System.out.println("Финальный массив: " + Arrays.toString(finishArray(scan.nextInt())));
        scan.close();
    }

    /**
     * Создание массива + сумма индексов + перобразование
     * @return финальный массив
     */
    private static int[] finishArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            if ((array[i] >= 10 && array[i] <= 99) || (array[i] <= -10 && array[i] >= -99)) {
                sum += i;
            }
        }

        System.out.println("Введенный массив: " + Arrays.toString(array));
        convertedArray(array, sum);
        return array;

    }

    /**
     * Заменяем в полученном массиве отрицательные элементы на сумму индексов
     * @param array полученный массив
     * @param sum сумма индексов
     * @return конечный массив
     */
    private static int[] convertedArray(int[] array, int sum) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] <= 0) {
                array[j] = sum;
            }
        }
        return array;
    }
}




