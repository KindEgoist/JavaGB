package org.example.seminars.s3.pro4;



import org.example.seminars.s3.pro3.model.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */
public class Pro4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(10, "красный", "деревянный");
        Cube cube2 = new Cube(73, "желтый", "металлический");
        Cube cube3 = new Cube(25, "зеленый", "картонный");
        Cube cube4 = new Cube(81, "желтый", "картонный");
        Cube cube5 = new Cube(3, "желтый", "деревянный");
        Cube cube6 = new Cube(81, "желтый", "картонный");
        Cube cube7 = new Cube(3, "желтый", "деревянный");

        List<Cube> listCubes = new ArrayList<>();
        listCubes.add(cube1);
        listCubes.add(cube2);
        listCubes.add(cube3);
        listCubes.add(cube4);
        listCubes.add(cube5);
        listCubes.add(cube6);
        listCubes.add(cube7);
        System.out.println("Просто коллекция: " + listCubes.size());
        System.out.println("Уникальная коллекция: " + unicumCollections(listCubes).size());
    }

    private static Collection<Cube> unicumCollections(List<Cube> listCubes) {
        return new HashSet<>(listCubes);
    }
}

