package org.example.seminars.s7oop.pro2;

public class ProductWater extends Product{
    private Integer voluem;

    public Integer getVoluem() {
        return voluem;
    }

    public void setVoluem(Integer voluem) {
        this.voluem = voluem;
    }

    public ProductWater(String name, Double price, Integer voluem) {
        super(name, price);
        this.voluem = voluem;
    }

    public ProductWater(String name, Double price) {
        super(name, price);
    }
}
