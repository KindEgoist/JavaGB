package org.example.homework.h3.pro3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String surname;
    private int price;
    private int yearOfPublishing;
    private int numberOfPages;
}
