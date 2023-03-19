package org.example.lectures.l4;

import java.util.Stack;

/**
 * LinkedList
 * представляет собой двусвязный список
 * Список - гибкая структура данных, позволяеющая легко менять свой размер.
 * Элементы доступны для вставки или удаления в любой позиции.
 * Добавление и удаление элементов - список в приоритете
 * Считывание данных - приоритете массив
 * LinkedList нужен для небольшого количества элементов, в которых операци добавления\удаления
 * встречаются чащу операций чтения.
 *
 */
public class Pro1 {
    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);

        /**
         * Queue
         * Наивысший приоритет имеет "наименьший" элемент.
         */
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        int item = queue.remove();

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(123);
//        pq.add(3);
//        pq.add(13);
//        pq.add(1);
//        System.out.println(pq);
//        System.out.println(pq.poll()); //удалили 1
//        System.out.println(pq);

        /**
         * Deque
         * Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.
         */

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1); deque.addLast(2);
//        deque.removeFirst(); deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst(); deque.pollLast();
//        deque.getFirst(); deque.getLast();
//        deque.peekFirst(); deque.peekLast();

        /**
         * Stack
         * Stack представляет собой обработку данных по принципу LIFO(какой элемент заходит первый,
         * будет обработан последним).
         * Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
         *
         * push(E item)
         * pop()
         *
         *

         */

        /**
         * Вычислить значение выражения в постфиксной форме записи.
         * 1 + 2 * 3             (1 + 2) * 3 инфиксная форма записи
         * 123*+                12+3*          постфиксной форме записи
         */
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])){ // является ли тикущий элемент числом
                st.push(Integer.parseInt(exp[i])); // если является, то перебразуем его из строки в число и добавляем в стек
            } else { // иначе
                switch (exp[i]){
                    case "+": // если у нас элемент +
                        res = st.pop() + st.pop(); // вытащить 2а элемента из стека и их сложить
                        st.push(res); // и положить обратно с стек
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }

        }
        System.out.printf("%d\n", st.pop());
    }

    /**
     * Проверка строки на число
     * @param s
     * @return
     * @throws NumberFormatException
     */
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
