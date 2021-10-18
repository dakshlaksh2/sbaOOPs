package org.perscholas;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class MyOwnAutoShop {
    public static void main(String args[]) {
        Sedan s = new Sedan(25, 30000, "Black",25);
        Truck t = new Truck(100, 60000, "White", 5000);
        Ford f = new Ford(150, 30000, "Blue",2021,2000);
        Ford f2 = new Ford(200, 30000, "Red",2020,3000);
        Car car = new Car(100, 30000, "white");

        double truckSalePrice=t.getSalePrice();
        double fordSalePrice = f.getSalePrice();
        double sedanSalePrice = s.getSalePrice();
        double ford2SalePrice = f2.getSalePrice();
        double carSalePrice  =car.getSalePrice();
        //30000-1500 = 28500 (5% of 30000 is 1500) since the length is more than 20,discount 5%
        System.out.println("The sale price of the Sedan is : " + NumberFormat.getCurrencyInstance().format(sedanSalePrice));
        //30000-3000 =2700 (10% 30000 is 3000)
        System.out.println("The Sale Price of the truck is : " +NumberFormat.getCurrencyInstance().format(truckSalePrice));
        //30000-2000
        System.out.println("The sale price of the ford is : " + NumberFormat.getCurrencyInstance().format(fordSalePrice));
        //30000-3000
        System.out.println("The sale price of the ford #2 is : " + NumberFormat.getCurrencyInstance().format(ford2SalePrice));
        System.out.println("The sale price of the car is : " + NumberFormat.getCurrencyInstance().format(carSalePrice));
    }
}
