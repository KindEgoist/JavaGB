package org.example.seminars.s2.pro4;

import org.example.seminars.s2.pro4.model.Vector;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите координаты вектора X,Y,Z: ");
//        Vector vector = new Vector(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
//        vector.setX(1.0);
//        vector.setY(1.0);
//        vector.setZ(1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длина вектора = " + vector1.lenghtVector());
        System.out.println("Длина вектора = " + vector2.lenghtVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Произведение векторов = " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = " + vector1.cosVector(vector2));
        System.out.println("Сумма векторов = " + vector1.summVector(vector2));
        System.out.println("Разность векторов = " + vector1.differenceVector(vector2));



    }
}
