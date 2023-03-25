package org.example.seminars.s6.pro4;

public class Kelvin implements Converter{
    @Override
    public Double convertValue(Double inputValue) {
        return inputValue + 273.15;
    }
}
