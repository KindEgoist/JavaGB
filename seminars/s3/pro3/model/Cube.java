package org.example.seminars.s3.pro3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cube {
    private Integer size ;
    private String color;
    private String material;
}
