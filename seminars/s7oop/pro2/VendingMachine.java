package org.example.seminars.s7oop.pro2;

import java.util.ArrayList;

public class VendingMachine implements Mashim{
    private ArrayList<Product> list;

    public VendingMachine(){
        list = new ArrayList<Product>();
    }

    public void addProduct(Product newItem){
        list.add(newItem);
    }
    public ArrayList getProductByName(String searchName){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if(item.getName().contains(searchName)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getProductByPrice(Double searchPrice){
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list){
            if(item.getPrice().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
