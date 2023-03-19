package org.example.seminars.s3.pro1.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Double volume;
}
