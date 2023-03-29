package org.example.homework.h7oop;
/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 *
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
 * перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий
 * имени, объему и температуре
 *
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
 * заложенную в программе
 *
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Product> all = new ArrayList<>();
//        all.add(new Product("water 0.5l", 200.0));
//        all.add(new Product("water 1l", 300.0));
//        all.add(new Product("coffe", 200.0));
//        all.add(new Product("tee", 300.0));
//        System.out.println(all);


        List<Product> lstBW = new ArrayList<>();
        lstBW.add(new BottleOfWater("water 0.5l", 200.0, 200));
        lstBW.add(new BottleOfWater("water 1l", 300.0, 300));
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(lstBW);
        BottleOfWater water = machine.getProduct("water 1l",300);
        System.out.println(water);

        List<Product> lstHD = new ArrayList<>();
        lstHD.add(new HotDrink("coffe", 200.0,200 ,1000));
        lstHD.add(new HotDrink("tee", 300.0, 300,90));
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine(lstHD);
        HotDrink drink = machine2.getProduct("tee",300, 90);
        System.out.println(drink);


    }
}
