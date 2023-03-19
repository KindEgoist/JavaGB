package org.example.lectures.l3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Иерархия коллекций. ArrayList
 * Разные способ создания
 * ArrayList list = new ArrayList();
 * Иерархия коллекций. List
 * List - пронумерованный набор элементов.
 * Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
 * Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать
 * элементы в списке.
 * ArrayList, LinkedList(Vector, Stack - устаревшие)
 * Разные способы создания
 * ArrayList<Integer> list1 = new ArrayList<Integer>();
 * ArrayList<Integer> list2 = new ArrayList<>();
 * ArrayList<Integer> list3 = new ArrayList<>(10);
 * ArrayList<Integer> list4 = new ArrayList<>(list3);
 */
public class Pro4 {
//    public static void main(String[] args) {
//        ArrayList <Integer> list  = new ArrayList <Integer> (); // рекомендуется указывать тип с каким мы работаем, в данном случае Integer
////        ArrayList list  = new ArrayList(); // сырой тип (Save Type), не рекомендуется без указания с какими типами мы работаем
//        list.add(2809);
////        list.add("12334");
//
//        for (Object o : list){
//            System.out.println(o);
//        }
//    }
    public static void main(String[] args) {
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] data = {day, month, year};
//        List<Integer> d = Arrays.asList(data);
//        System.out.println(d); //[29, 9, 1990]
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] data = new StringBuilder[] {day, month, year};
        List<StringBuilder> d = Arrays.asList(data);
        System.out.println(d); // [29, 9, 1990]
        data[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

}
}
