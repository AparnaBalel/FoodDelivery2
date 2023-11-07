package com.solvd.foodDelivery;

import Restaurants.Menu;

public interface Customer extends nameAddress{


    @Override//
    public default void displayName(String name, String address) {

    }
}
