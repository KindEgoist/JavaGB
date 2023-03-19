package org.example.homework.h3.pro2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDetails {
    private String itemName;
    private String manufacturerСountry;
    private int weight;
    private int price;
    private int grade;
}
