package org.perscholas;

public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    // If weight>2000, 10%discount. Otherwise, 20%discount.
    @Override
    double getSalePrice() {
            return super.getSalePrice() * (weight > 2000 ? 0.9 : 0.8);
        }


}
