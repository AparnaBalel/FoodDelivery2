package com.solvd.foodDelivery.Restaurants;

import java.util.ArrayList;

public abstract class RestaurantMenuCard {
    String menuName;
    double price;
    int time;

    public RestaurantMenuCard(String menuName, double price, int time) {
        this.menuName = menuName;
        this.price = price;
        this.time = time;
    }


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  menuName + ", $"+price +", "+"wait time: " + time +" min" ;
    }
}
