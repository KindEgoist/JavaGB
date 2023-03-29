package org.example.seminars.s7oop.pro2;

import java.util.ArrayList;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts
 * (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 *
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом
 * ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтома
 *
 * Создать перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным входным параметром
 * (пример: getProduct(String name) выдающий товар по имени, создать метод возвращающий товар по имени и
 * какому-либо параметру товара getProduct(String name, int volue)
 */

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Chocolate("snickers", 100.0, 10));
        machine.addProduct(new Chocolate("mars", 200.0));
        machine.addProduct(new ProductWater("water 0.5l", 300.0, 15));
        machine.addProduct(new ProductWater("water 1l", 200.0));

//        ArrayList list = machine.getProductByName("water");
//        System.out.println(list);
//        ArrayList list2 = machine.getProductByPrice(300.0);
//        System.out.println(list2);
        Mashim mashim = new VendingMachine();
        mashim.addProduct(new ProductWater("water 0.5l", 300.0, 15));
        System.out.println(mashim.getProductByPrice(300.0));

    }
}
