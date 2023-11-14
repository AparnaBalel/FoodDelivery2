package com.solvd.foodDelivery.Restaurants;

import com.solvd.foodDelivery.LogInfo.CustomLogger;
import com.solvd.foodDelivery.Restaurants.IceCreamShop.BaskinRobin;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuItems extends AllRestaurant{
    private CustomLogger Logger;
    public MenuItems() {
        // Create an instance of CustomLogger for this class
        this.Logger = new CustomLogger(MenuItems.class.getName());
    }
    AllRestaurant restaurant = new AllRestaurant();
    Scanner scan = new Scanner(System.in);
     public void all() {
         restaurant.RestaurantList( burgers,  fastFood, pizza,  cafe,  breakfast,  iceCream );
     }
        public void ChooseFood() {
            Logger.Info("choose want you want to eat from list");
            String choose = scan.nextLine();

            ArrayList< Object> list =new ArrayList<>();

            switch (choose) {
                case "burgers":
                    restaurant.burger();
                    String order1 = scan.nextLine();
                    if (order1.equalsIgnoreCase("burger king")) {
                         list.add(restaurant.burgerKingMenu());
                    } else if (order1.equalsIgnoreCase("jack in the box")) {
                        list.add(restaurant.jackInTheBoxMenu());
                    }
                    break;
                case "cafe":
                    restaurant.cafe();
                    String order2 = scan.nextLine();
                    if (order2.equalsIgnoreCase("cafe coffee day")) {
                              list.add(restaurant.cafeCoffeeDayMenu());
                    } else if (order2.equalsIgnoreCase("starbucks")) {
                    list.add(restaurant.starbucksMenu());
                    }
                    break;
                case "breakfast":
                    restaurant.breakFast();
                    String order3 = scan.nextLine();
                    if (order3.equalsIgnoreCase("Ihop")) {
                       list.add(restaurant.ihopMenu());
                    } else if (order3.equalsIgnoreCase("Denny's")) {
                        list.add(restaurant.dennysMenu());
                    }
                    break;
                case "fast food":
                    restaurant.fastFood();
                    String order4 = scan.nextLine();
                    if (order4.equalsIgnoreCase("Panda express")) {
                            list.add(restaurant.pandaExpressMenu());
                    } else if (order4.equalsIgnoreCase("subway")) {
                             list.add(restaurant.subwayMenu());
                    }
                    break;

                case "ice cream":
                    restaurant.iceCream();
                    String order5 = scan.nextLine();
                    if (order5.equalsIgnoreCase("baskin robin")) {
                          list.add(restaurant.baskinRobinMenu());
                    } else if (order5.equalsIgnoreCase("cold stone")) {
                        list.add(restaurant.coldStoneMenu());
                    }
                    break;
                case "pizza":
                    restaurant.Pizza();
                    String order6 = scan.nextLine();
                    if (order6.equalsIgnoreCase("pizza hut")) {
                         list.add(restaurant.PizzaHutMenu());
                    } else if (order6.equalsIgnoreCase("tandoori")) {
                            list.add(restaurant.TandooriMenu());
                    }
            }

            for (Object fruit:list){
                System.out.println("successfully added to list: " + fruit );
            }
       }
            public void addFood(){
                System.out.println("do you want to add more food?");
                String more = scan.nextLine();
                if(more.equalsIgnoreCase("yes")){
                    all();
                    ChooseFood();
                }
                else if (more.equalsIgnoreCase("no")){
                  //  System.out.println("please add your  name address and payments details");
                }
            }
        }




















