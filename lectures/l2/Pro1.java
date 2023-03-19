package org.example.lectures.l2;

/**
 * API(Aplication programing interface) - это контракт, который предоставляет программа.
 * "Ко мне можно обращаться так и так, я обязуюсь делать то и это".
 * Это возможности, которые предоставляют разаботчики языка для удобного взаимодействия с его функционалом.
 */

public class Pro1 {
        // Строки
//    String VS StringBuilder | String- много изменений(разбираем уже созданный). StringBuilder - много пероброзований (собираем материал)
//    public static void main(String[] args) {
//        var s = System.currentTimeMillis(); // засекли время начала работы программы
////        Создать строку из 1 млн плюсиков.
//        String str = ""; // долгий вариант ~212_160 ms
//        for (int i = 0; i < 1_000_000; i++) {
//            str +="+";
//        }
////       StringBuilder sb = new StringBuilder();// быстрый вариант ~39 ms
////        for (int i = 0; i < 1_000_000; i++) {
////            sb.append("+");
////        }
//        System.out.println(System.currentTimeMillis() - s);// конец работы - начала = сколько времени прошло работы программы
//    }
//    /**
//     * concat() - объединение строк
//     * valueOf()- преобразует Object в строковое представление (завязан на toString())
//     * join() - объединяет набор строк в одну с учетом разделителя
//     * charAt() - получение символа по индексу
//     * indexOf() - первый индекс вхождения подстроки
//     * lastIndexOf() - последний индекс вхождения подстроки
//     * startWith()/endsWith() - определяет, начинается/заканчивается ли строка с подстроки
//     * replace() - замена одной подстроки на другую
//     * trim() - удаляет начальные и конечные пробелы
//     * substring() - возвращает подстроку, см.аргументы
//     * toLowerCase()/toUpperCase() - возвращает новую строку в нижнем/верхнем регистре
//     * compareTo() - сравнивает две строки
//     * equals() - сравнивает строки с учетом регистра
//     * equalsIgnoreCase() - сравнивает строки без учета регистра
//     * regionMatches() - сравнивает подстроки в строках
//     */
//    public static void main(String[] args) {
//        String[] name = {"С", "е", "р", "г", "е", "й"};
//        String sk = "СЕРГЕЙ КА.";
//        System.out.println(sk.toLowerCase()); // серега ка.
//        System.out.println(String.join("", name)); //Сергей
//        System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
//        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й")); //С,е,р,г,е,й
//    }
}