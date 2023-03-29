package org.example.seminars.s7oop.pro1;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats();

        cat.setName("Barsik");
        System.out.println(cat.getName()); //Barsik
        System.out.println(cat); //org.example.seminars.s7oop.pro1.Cats@7ef20235
        cat.saySomtheing();//MEOW

        cat.sayWithInterface();//meow interface

        BengalCat cat1 = new BengalCat();
        cat1.saySomtheing(); //im bengal cat


    }
}
