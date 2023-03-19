package org.example.seminars.s3.pro2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evalutions;
}
