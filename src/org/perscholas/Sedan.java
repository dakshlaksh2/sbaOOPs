package org.perscholas;

public class Sedan extends Car{
    int length;

    public Sedan(int speed, double regularPrice, String color,int length) {
        super(speed, regularPrice, color);
        this.length=length;
    }
    // If length>20 feet, 5%discount, Otherwise, 10%discount
    public double getSalePrice() {
        return super.getSalePrice() * (length > 20 ? 0.95 : 0.9);
    }

}
