package org.example.lectures.l7oop.l7_3;

/**
 * ООП НГаследование
 * Наследование - это свойство системы, позволяющее опсивать новы класс на основе уже существующего,
 * с частичной или полностью заимствующейся функциональностью.
 *
 * Класс, от которого производится наследование, называется бызовым или родительским.
 * Новый класс - потомком, наследником или производным классом.
 */
public class Pro3 {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());
    }
}
