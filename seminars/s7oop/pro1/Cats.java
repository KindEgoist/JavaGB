package org.example.seminars.s7oop.pro1;

public class Cats extends CatMover implements CatInterface{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//        System.out.println("MEOW");


    public void say(){
        System.out.println(name);
    }

    @Override
    public void saySomtheing() {
        System.out.println("MEOW");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("meow interface");
    }

//    @Override
//    public String toString() {
//        return "Cats{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
