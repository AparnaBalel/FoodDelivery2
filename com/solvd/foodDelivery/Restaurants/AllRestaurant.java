package com.solvd.foodDelivery.Restaurants;

import com.solvd.foodDelivery.LogInfo.CustomLogger;
import com.solvd.foodDelivery.Restaurants.BreakFast.DennyS;
import com.solvd.foodDelivery.Restaurants.BreakFast.IHop;
import com.solvd.foodDelivery.Restaurants.Burgers.BurgerKing;
import com.solvd.foodDelivery.Restaurants.Burgers.JackInTheBox;
import com.solvd.foodDelivery.Restaurants.Cafe.CafeCoffeeDay;
import com.solvd.foodDelivery.Restaurants.Cafe.Starbucks;
import com.solvd.foodDelivery.Restaurants.FastFood.PandaExpress;
import com.solvd.foodDelivery.Restaurants.FastFood.Subway;
import com.solvd.foodDelivery.Restaurants.IceCreamShop.BaskinRobin;
import com.solvd.foodDelivery.Restaurants.IceCreamShop.ColdStone;
import com.solvd.foodDelivery.Restaurants.Pizza.PizzaHut;
import com.solvd.foodDelivery.Restaurants.Pizza.TandooriPizza;

public class AllRestaurant extends restaturantList  implements nameAddress, Menu{
    private CustomLogger Logger;

    public AllRestaurant() {
        // Create an instance of CustomLogger for this class
        this.Logger = new CustomLogger(AllRestaurant.class.getName());
    }

    public void displayMenu(String menu) {
        Logger.Info( menu.toString() );
    }
    public void displayMenu(String menu, double price, int time) {
        Logger.Info( menu.toString() );
    }
    @Override
    public void processChoice(String choose) {

    }
    @Override
    public void displayName(String name, String address) {
        Logger.Info(name+","+"\n"+"Address: "+ address);
    }

    public void burger(){
           displayName("Burger King","1 E grant line ");
           BurgerKing burgerkingMenu = new BurgerKing("chicken Burger",5.00, 10);
           displayMenu(burgerkingMenu.toString());
           System.out.println();
           displayName("jack in the box","2 E grant line ");
           JackInTheBox jackMenu = new JackInTheBox("tiny taco",4,4);
           displayMenu(jackMenu.toString());
    }
    public String burgerKingMenu(){
        BurgerKing burgerkingMenu = new BurgerKing("chicken Burger",5.00, 10);
        displayMenu(burgerkingMenu.toString());
        return String.valueOf(burgerkingMenu);
    }
    public String jackInTheBoxMenu(){
        JackInTheBox jackMenu = new JackInTheBox("tiny taco",4,4);
        displayMenu(jackMenu.toString());
        return String.valueOf(jackMenu.toString());
    }
    public void cafe(){
        displayName("Cafe coffee day","3 E grant line ");
        CafeCoffeeDay coffeeMenu = new CafeCoffeeDay("mocha", 5, 5);
        displayMenu(coffeeMenu.toString());
        System.out.println();
        Starbucks tea = new Starbucks("Chai Tea latte", 4.50, 10);
        displayMenu(tea.toString());
        displayName("Starbucks","4 E grant line ");
    }

    public String starbucksMenu(){
        Starbucks tea = new Starbucks("Chai Tea latte", 4.50, 10);
        displayMenu(tea.toString());
        return tea.toString();
    }
    public String cafeCoffeeDayMenu(){
        CafeCoffeeDay coffeeMenu = new CafeCoffeeDay("mocha", 5, 5);
        displayMenu(coffeeMenu.toString());
       return coffeeMenu.toString();
    }
    public void breakFast(){
        displayName("IHop","5 E grant line ");
        IHop omelette = new IHop("Spinach & Mushroom Omelette", 10.50, 15);
        displayMenu(omelette.toString());
        System.out.println();
        displayName("Denny's","6 E grant line ");
        DennyS pancake = new DennyS("Stack of Pancakes", 5.00, 10);
        displayMenu(pancake.toString());
    }
    public String ihopMenu(){
        IHop omelette = new IHop("Spinach & Mushroom Omelette", 10.50, 15);
        displayMenu(omelette.toString());
        return omelette.toString();
    }
    public String dennysMenu(){
        DennyS pancake = new DennyS("Stack of Pancakes", 5.00, 10);
        displayMenu(pancake.toString());
        return pancake.toString();
    }
    public void fastFood(){
        displayName("Panda Express","7 E grant line ");
        PandaExpress chicken = new PandaExpress("Orange Chicken", 8.50, 5);
        displayMenu(chicken.toString());
        System.out.println();
        displayName("Subway","8 E grant line ");
        Subway footLong = new Subway("Veggie Delite", 12.50, 8);
        displayMenu(footLong.toString());
    }
    public String pandaExpressMenu(){
        PandaExpress chicken = new PandaExpress("Orange Chicken", 8.50, 5);
        displayMenu(chicken.toString());
        return chicken.toString();
    }
    public String subwayMenu(){
        Subway footLong = new Subway("Veggie Delite", 12.50, 8);
        displayMenu(footLong.toString());
        return footLong.toString();
    }

          //Generic class
    BaskinRobin<String, Double, Integer> baskinRobin = new BaskinRobin<>("Banana Royale",10.50, 8);

    public void iceCream() {
        displayName("baskinRobin", "9 E grant line ");
        displayMenu( baskinRobin.toString());
        System.out.println();
        displayName("coldStoneCreamery", "10 E grant line ");
        ColdStone butter = new ColdStone("Peanut Butter Cup", 8.50, 15);
        displayMenu(butter.toString());
    }
    public String baskinRobinMenu(){
        displayMenu( baskinRobin.toString());
        return baskinRobin.toString();
    }
    public String coldStoneMenu(){
        ColdStone butter = new ColdStone("Peanut Butter Cup", 8.50, 15);
        displayMenu(butter.toString());
        return butter.toString();
    }

    public void Pizza(){
        displayName("Pizza hut","11 E grant line ");
        PizzaHut veggie = new PizzaHut("spinach alfredo", 15.00, 20);
        displayMenu(veggie.toString());
        System.out.println();
        displayName("Tandoori Pizza","12 E grant line ");
        TandooriPizza tandoori = new TandooriPizza("Tandoori Chicken", 20.50, 25);
        displayMenu(tandoori.toString());
    }
    public String PizzaHutMenu(){
        PizzaHut veggie = new PizzaHut("spinach alfredo", 15.00, 20);
        displayMenu(veggie.toString());
        return veggie.toString();
    }
    public String TandooriMenu(){
        TandooriPizza tandoori = new TandooriPizza("Tandoori Chicken", 20.50, 25);
        displayMenu(tandoori.toString());
        return tandoori.toString();
    }


    @Override
    void  RestaurantList(String burgers, String fastFood, String pizza, String cafe, String breakfast, String iceCream) {
        Logger.Info("\n"+burgers+ "\n"+ fastFood +"\n"+ pizza + "\n"+ cafe + "\n"+ breakfast + "\n"+ iceCream);

    }
}
