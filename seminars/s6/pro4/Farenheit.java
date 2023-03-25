package org.example.seminars.s6.pro4;

public class Farenheit implements Converter{
    @Override
    public Double convertValue(Double inputValue) {
          return (inputValue * 9) / 5 + 32;
    }
}
