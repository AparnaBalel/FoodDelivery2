package com.solvd.foodDelivery.delivery;

import com.solvd.foodDelivery.Restaurants.nameAddress;

public interface Customer extends nameAddress {


    @Override//
    public default void displayName(String name, String address) {

    }
}
