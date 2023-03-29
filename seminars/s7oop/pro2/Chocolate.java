package org.example.seminars.s7oop.pro2;

public class Chocolate extends Product{
    private Integer sugar;
    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Integer sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }
}
