package org.example.seminars.s6.pro4;

public class Main {
    public static void main(String[] args) {
        Double t = 100.0;
        Double tFar = new Farenheit().convertValue(t);
        Double tKelvin = new Kelvin().convertValue(t);
        Double tCelsia = new Celsia().convertValue(t);

        System.out.println(t + " в Целсиях = " + tCelsia);
        System.out.println(t + " в Фарингенте = " + tFar);
        System.out.println(t + " в Кельвинах = " + tKelvin);

    }
}
