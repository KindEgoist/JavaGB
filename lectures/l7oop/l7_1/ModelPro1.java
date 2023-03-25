package org.example.lectures.l7oop.l7_1;

/**
 * public и private - индикаторы доступа
 * public доступен всегда везде
 * private доступен только внутри класса
 *
 * Перегрузака методов - это прием программирования, который позволяет разаработчику в одном классе для методов
 * с разными параметрами использовать одно и тоже имя.
 */

public class ModelPro1 { //public - индикатор доступа
    int x, y;

    /**
     * Создаем конструктор для переменный в поле
     * @param valueX
     * @param valueY
     */
    public ModelPro1(int valueX, int valueY){ // перегрузка
        x = valueX;
        y = valueY;
    }
    public ModelPro1(int value){
        this(value, value);
    }
    public ModelPro1(){
        this(0);
    }

//    /**
//     * конструктор по умолчанию
//     */
//    public ModelPro1(){ // перегрузка
//        x = 0;
//        y = 0;
//    }
//
//    /**
//     * конструктор для одного элемента
//     * @param x
//     */
//    public ModelPro1(int x){ //перегрузка
//        x = 0;
//        y = 0;
//    }

    /**
     * метод который преобразует сылку значений х и y в строку
     * @return
     */
    public String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    /**
     * можно переделать методы под себя.
     * напримере to.String
     * @return метод toString будет возвращать метод getInfo
     */
    @Override //переопределение метода
    public String toString() {
        return getInfo(); // можно убрать метод getInfo и возращать тут String.format("x: %d; y: %d", x, y);
    }
}
