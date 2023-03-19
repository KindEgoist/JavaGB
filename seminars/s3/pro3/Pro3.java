package org.example.seminars.s3.pro3;



import org.example.seminars.s3.pro3.model.Cube;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет
 * (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Pro3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(10, "красный", "деревянный");
        Cube cube2 = new Cube(73, "желтый", "металлический");
        Cube cube3 = new Cube(25, "зеленый", "картонный");
        Cube cube4 = new Cube(81, "желтый", "картонный");
        Cube cube5 = new Cube(3, "желтый", "деревянный");

        List<Cube> listCubes = new ArrayList<>();
        listCubes.add(cube1);
        listCubes.add(cube2);
        listCubes.add(cube3);
        listCubes.add(cube4);
        listCubes.add(cube5);

        int countCube = 0; //количество желтых
        int sumVolue = 0; //
        int countWood = 0; // количество деревянных

        for (Cube cube : listCubes){
            if (cube.getColor().equals("желтый")){
                countCube ++;
                sumVolue += volumeCube(cube.getSize());
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3){
                countWood ++;
            }
            }
        }
        System.out.println("Количество желтых = " + countCube + " и их сумарный объем = " + sumVolue);
        System.out.println("Количество деревянных кубиков с ребром 3 = " + countWood);

    }

    private static int volumeCube(Integer size) {
        return size * size * size;
    }
}
