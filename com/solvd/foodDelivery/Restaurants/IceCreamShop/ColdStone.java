package com.solvd.foodDelivery.Restaurants.IceCreamShop;

public class ColdStone {

    String menuName;
    double price;
    int time;

    public ColdStone(String menuName, double price, int time) {
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
        return  '\n'+ "ColdStoneCreamery: " + menuName + ',' + price + "," + time ;
    }
}
