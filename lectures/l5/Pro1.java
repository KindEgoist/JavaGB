package org.example.lectures.l5;

import java.util.HashMap;
import java.util.Map;

/**
 * Map - это множество коллекций, работающих с данными по принципу <Ключ/Значение>
 * Ключевые особенности:
 * -ускоренная обработка данных;
 * -порядок добавления не запоминается.
 * В HashMap элементы располагаются как угодно и могут менять свое положение.
 * Ключвые особенности:
 * -допускаются только уникальные ключи, значения могут повторяться
 * -помните про null значения
 * -ускоренная обработка данных
 * -порядок заполнения не запоминается
 *
 * Хэш-функции и хэш-таблицы
 * Прямое связывание (хэширование с цепочками)
 * Хэширование с открытой адресацией
 * Теория графов:
 * -деревья построенные на списках
 * -бинарные деревья
 * -сбалансированные деревья
 * -алгоритм балансировки дерева
 * -красно-черные деревья, деревья поиска
 */
public class Pro1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1,"один"); //добавление с проверкой были ли такие уже значения
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db); // {nul=!null, 1=один, 2=два}
        System.out.println(db.get(44)); //null
        db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); //true проверка значения
//        System.out.println(db.containsValue(1)); //false
//        System.out.println(db.containsKey("один"));//false
        System.out.println(db.containsKey(1)); //проверка ключа
        System.out.println(db.keySet()); //1 2
        System.out.println(db.values()); // один, два
    }
}
