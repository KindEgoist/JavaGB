package org.example.seminars.s4;

import javax.management.ListenerNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Учитывая заголовок односвязного списка, переверните список и верните перевернутый список.
 *  * Definition for singly-linked list.
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode() {}
 *  *     ListNode(int val) { this.val = val; }
 *  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *  1->2->3->4->5
 *  5->4->3->2->1
 *
 *  1->2->3->4->5->null
 *  ListNode pred = null // создаем предыдущий элемент с пустым значением
 *  ListNode current = head // к каррент присываемваем весь список
 *  while (current != 0) // пока каррент не = нулю выполнять цикл
 *  ListNode nextElem = current.next // в новом списке сохряняем следующий элемент из списка с сылками на следующие т.е. 2->3->4->5->null
 *  current.next = pred // присвыеваем к карент следующий сылку null <- 1
 *  pred = current // 1 -> null
 *  current = nextElem // 2->3->4->5
 *  повторяем пока не кончится Вайл
 *  вернуть pred
 */

/**
 * Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
 */
public class Pro1 {
    public static void main(String[] args) {
//        LinkedList<Integer> integerList = new LinkedList<>();
//        for (int i = 0; i < 6; i++) {
//            integerList.add(i);
//        }
//        System.out.println("peek = " + integerList.peek()); // посмотреть начальный элемент
//        System.out.println(integerList);
//        System.out.println("pop = " + integerList.pop()); // удалить начальный элемент
//        System.out.println(integerList);
//        integerList.addFirst(3); // в начале добавит элемент
//        System.out.println("add First " + integerList);
//        integerList.addLast(5); // в конец добавит элемент
//        System.out.println("add Last " + integerList);
//        integerList.remove(3); // удаление по индексу
//        System.out.println(integerList);
//        System.out.println(integerList.contains(2)); // проверка на наличие 2

        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sum = 0;
        for (Integer el : integerList){
            if (el % 2 == 0){
                sum += el;
            }
        }
        System.out.println(sum);
    }

}
