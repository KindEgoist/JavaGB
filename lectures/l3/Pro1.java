package org.example.lectures.l3;

/**
 * Тип даных Object - "Всему голова"
 * Упаковка - любой тип можно положить в переменную тип Object
 * Распаковка - преобразование Object-переменной в нужный тип
 * Иерархия типов - любой тип "ниже" Object'а
 * Животные->Млекопитающие->Приматы->Человек разумный
 */
public class Pro1 {
    public static void main(String[] args) {
        Object o = 1; GetType(o);   // java.lang.Integer Информация о типе данных
        o = 1.2; GetType(o);        // java.lang.Double
    }

    private static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
