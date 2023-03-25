package org.example.lectures.l7oop.l7_2;

public class Robot2 {
    /** Уровень робота*/
    private int level;
    /** Имя робота*/
    private String name;

    /**
     * Конструктор определяющий имя и уровень робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level){
        this.name = name;
        this.level = level;
    }
    // Методы вкл\выкл подсистем
    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();

    }
    public void powerOff(){
        this.sayBay();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }
    public String getName(){
        return this.name;
    }
    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS....");
    }
    /** Загрузка OS */
    private void startOS(){
        System.out.println("Start OS...");
    }
    /** Приветствие */
    private void sayHi(){
        System.out.println("Hello world...");

    }
    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS....");
    }
    /** Выгрузка OS */
    private void stopOS(){
        System.out.println("Stop OS...");
    }
    /** Прощание */
    private void sayBay() {
        System.out.println("Bay...");
    }
    /** Работа*/
    public void work() {
        System.out.println("Working...");
    }
}
