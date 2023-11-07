package Restaurants;

import com.solvd.foodDelivery.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItems extends AllRestaurant{
    AllRestaurant restaurant = new AllRestaurant();
    Scanner scan = new Scanner(System.in);
     public void all() {
         restaurant.RestaurantList( burgers,  fastFood, pizza,  cafe,  breakfast,  iceCream );
     }
        public void ChooseFood() {
            System.out.println("choose want you want to eat from list");
            String choose = scan.nextLine();
            ArrayList<String> foodlist = new ArrayList<String>();

            switch (choose) {
                case "burgers":
                    restaurant.burger();
                    //restaurant.burgerKingMenu();
                    String order1 = scan.nextLine();
                    if (order1.equalsIgnoreCase("burger king")) {
                        foodlist.add(restaurant.burgerKingMenu());
                    } else if (order1.equalsIgnoreCase("jack in the box")) {
                        foodlist.add(restaurant.jackInTheBoxMenu());
                    }
                    break;
                case "cafe":
                    restaurant.cafe();
                    String order2 = scan.nextLine();
                    if (order2.equalsIgnoreCase("cafe coffee day")) {

                        foodlist.add(restaurant.cafeCoffeeDayMenu());
                    } else if (order2.equalsIgnoreCase("starbucks")) {
                        foodlist.add(restaurant.starbucksMenu());
                    }
                    break;
                case "breakfast":
                    restaurant.breakFast();
                    String order3 = scan.nextLine();
                    if (order3.equalsIgnoreCase("Ihop")) {
                        foodlist.add((String) restaurant.ihopMenu());
                    } else if (order3.equalsIgnoreCase("starbucks")) {
                        foodlist.add((String) restaurant.dennysMenu());
                    }
                    break;
                case "fast food":
                    restaurant.fastFood();
                    String order4 = scan.nextLine();
                    if (order4.equalsIgnoreCase("Panda express")) {
                        foodlist.add((String) restaurant.pandaExpressMenu());
                    } else if (order4.equalsIgnoreCase("subway")) {
                        foodlist.add((String) restaurant.subwayMenu());
                    }
                    break;
                case "ice cream ":
                    restaurant.iceCream();
                    String order5 = scan.nextLine();
                    if (order5.equalsIgnoreCase("baskin robin")) {
                        foodlist.add((String) restaurant.baskinRobinMenu());
                    } else if (order5.equalsIgnoreCase("cold stone ")) {
                        foodlist.add((String) restaurant.coldStoneMenu());
                    }
                    break;
                case "pizza":
                    restaurant.Pizza();
                    String order6 = scan.nextLine();
                    if (order6.equalsIgnoreCase("pizza hut")) {
                        foodlist.add((String) restaurant.PizzaHutMenu());
                    } else if (order6.equalsIgnoreCase("tandoori")) {
                        foodlist.add( restaurant.TandooriMenu());
                    }
                    for (String foodList : foodlist) {
                        System.out.println("1***" + foodList);
                        System.out.println("hhllllll");
                    }

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
                    System.out.println("please add your  name address and payments details");


                }
            }




        }




















