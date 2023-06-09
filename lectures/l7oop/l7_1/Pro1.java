package org.example.lectures.l7oop.l7_1;

/**
 * Правильный план - реализация только после абстракций
 * Абстрайция - что делает сущность?
 * Поведение - как делает сущность?
 * Спецификация - набор правил, описывающих API
 *
 * Класс- это "чертеж" (описание) сущности предметной области,
 * позволяющей выделить некоторые общие характеристики, состояние и поведение, зависяще от состояния.
 *
 * Предметная область - множестро всех предметов(явлений) рашаемой проблемы.
 *
 * Экземпляры класа - отдельный предстовитель класа, имеющий КОНКРЕТНОЕ состояие и поведение,
 * которое полностью определяется описанием класса.
 *
 * Состояние - набор данных (полей, атрибутов, членов класса).
 *
 * Поведение - функции для работы с данными и выполнения полезной работы.
 *
 * Экземпляр класса:
 * -поля
 * -константы
 * -события
 * -конструкторы
 * -методы
 *
 * ОПП -  объектно-оринтированное программирование.
 * Парагдигма(стиль,шаблон) разработки ПО, основным понятием которой являются классы и объекты.
 * Говорят, что разработка в стиле ООП ведется с использованием классов объектов, которые обладают состоянием
 * и поведением, зависящим от этого состояния.
 */

public class Pro1 {
    public static void main(String[] args) {
        ModelPro1 a = new ModelPro1(0, 2);
//        a.x = 0;
//        a.y = 2;

/**
 * для конструктора по умолчанию
 */
        ModelPro1 b = new ModelPro1();
        b.x = 0;
        b.y = 10;
        System.out.println(b.getInfo()); //c методом getInfo() теперь будет все выводится нормально
        System.out.println(a); // с изменением метода toString который возвращает getInfo(). Ненужно теперь прописывать дополнительно метод
        System.out.println(distance(a, b));

        ModelPro1 c = new ModelPro1(10);
    }
    static double distance(ModelPro1 a, ModelPro1 b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
