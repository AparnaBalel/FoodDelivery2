package com.solvd.foodDelivery.Restaurants.IceCreamShop;

public class BaskinRobin <T, U, V>{
    /*private CustomLogger Logger;
    public BaskinRobin() {
        // Create an instance of CustomLogger for this class
        this.Logger = new CustomLogger(BaskinRobin.class.getName());
    }*/

      private T  menu;
      private U price;
      private V time;

    public BaskinRobin(T menu, U price, V time) {
        this.menu = menu;
        this.price = price;
        this.time = time;
    }

    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public V getTime() {
        return time;
    }

    public void setTime(V time) {
        this.time = time;
    }

    public T getMenu() {
        return menu;
    }

    public void setMenu(T menu) {
        this.menu = menu;
    }


    public void BaskinRobinMenu(){
        System.out.println(menu);
        System.out.println(price);
        System.out.println(time);

    }

    @Override
    public String toString() {
        return "\n"+ "BaskinRobin: " + "," + menu + "," + price + ", " + time ;
    }
}
