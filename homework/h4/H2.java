package org.example.homework.h4;

import java.util.*;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '[' и ']', определите,
 * допустима ли входная строка. Входная строка действительна, если: Открытые скобки должны быть
 * закрыты однотипными скобками. Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 */
public class H2 {
    public static void main(String[] args) {
        String text1 = "())";
        String text2 = "()[]{}";
        String text3 = "(]";
        String text4 = "([)]";
        String text5 = "";
        String text6 = "([])";


        System.out.println("1 = " + parenthesisСheck(text1));
        System.out.println("2 = " + parenthesisСheck(text2));
        System.out.println("3 = " + parenthesisСheck(text3));
        System.out.println("4 = " + parenthesisСheck(text4));
        System.out.println("5 = " + parenthesisСheck(text5));
        System.out.println("6 = " + parenthesisСheck(text6));

    }

    private static boolean parenthesisСheck(String text) {

        Deque<Character> list = new LinkedList<>();
        for (Character symbol : text.toCharArray()) {
            if (symbol == '(') list.add(')');
            else if (symbol == '[') list.add(']');
            else if (symbol == '{') list.add('}');
            else if (list.isEmpty() || list.pop() != symbol) return false;
        }
        return true;

    }

}
