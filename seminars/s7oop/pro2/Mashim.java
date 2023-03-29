package org.example.seminars.s7oop.pro2;

import java.util.ArrayList;

public interface Mashim {
    public void addProduct(Product newItem);
    public ArrayList getProductByName(String searchName);
    public ArrayList getProductByPrice(Double searchPrice);

}
