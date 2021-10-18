package org.perscholas;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    double getSalePrice(){
        return regularPrice;
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
}
