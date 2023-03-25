package org.example.lectures.l6;

import java.util.Arrays;
import java.util.HashSet;

public class Pro2 {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a); u.addAll(b); // в u добавляем b
        var r = new HashSet<Integer>(a); r.retainAll(b); // персечение
        var s = new HashSet<Integer>(a); s.removeAll(b); // вычитание
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b);// [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u);// [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r);// [2, 3, 5, 7]
        System.out.println(s);// [1, 4, 6]
        boolean res = a.addAll(b);
    }
}
