package org.example.lectures.l5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable
 * "Устаревший брат" коллекция HashMap которая не знает про null
 */
public class Pro6 {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table);// {2=один, 1=два, 11=один один}
    }
}
