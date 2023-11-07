package com.solvd.foodDelivery;

import Restaurants.MenuItems;

public class Main {
    public static void main(String[] args)  {
        MenuItems menu = new MenuItems();
        DeliveryDetails deliverDetails = new DeliveryDetails();
        menu.all();
        menu.ChooseFood();
        menu.addFood();
        deliverDetails.OrderDetails();//
    }

}