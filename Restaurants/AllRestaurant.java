package Restaurants;

import Restaurants.BreakFast.DennyS;
import Restaurants.BreakFast.IHop;
import Restaurants.Burgers.BurgerKing;
import Restaurants.Burgers.JackInTheBox;
import Restaurants.Cafe.CafeCoffeeDay;
import Restaurants.Cafe.Starbucks;
import Restaurants.FastFood.PandaExpress;
import Restaurants.FastFood.Subway;
import Restaurants.IceCreamShop.BaskinRobin;
import Restaurants.IceCreamShop.ColdStoneCreamery;
import Restaurants.Pizza.PizzaHut;
import Restaurants.Pizza.TandooriPizza;
import com.solvd.foodDelivery.nameAddress;

public class AllRestaurant extends restaturantList  implements nameAddress, Menu{

    public void displayMenu(String menu) {
        System.out.println( menu.toString() );
    }
    @Override
    public void processChoice(String choose) {

    }
    @Override
    public void displayName(String name, String address) {
        System.out.println(name+","+"\n"+"Address: "+ address);
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
        return null;
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
        return null;
    }
    public String cafeCoffeeDayMenu(){
        CafeCoffeeDay coffeeMenu = new CafeCoffeeDay("mocha", 5, 5);
        displayMenu(coffeeMenu.toString());
       return null;
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
    public Object ihopMenu(){
        IHop omelette = new IHop("Spinach & Mushroom Omelette", 10.50, 15);
        displayMenu(omelette.toString());
        return null;
    }
    public Object dennysMenu(){
        DennyS pancake = new DennyS("Stack of Pancakes", 5.00, 10);
        displayMenu(pancake.toString());
        return null;
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
    public Object pandaExpressMenu(){
        PandaExpress chicken = new PandaExpress("Orange Chicken", 8.50, 5);
        displayMenu(chicken.toString());
        return null;
    }
    public Object subwayMenu(){
        Subway footLong = new Subway("Veggie Delite", 12.50, 8);
        displayMenu(footLong.toString());
        return null;
    }
    public void iceCream(){
        displayName("baskinRobin","9 E grant line ");
        BaskinRobin iceCream = new BaskinRobin("Banana Royale", 10.50, 15);
        displayMenu(iceCream.toString());
        System.out.println();
        displayName("coldStoneCreamery","10 E grant line ");
        ColdStoneCreamery butter = new ColdStoneCreamery("Peanut Butter Cup", 8.50, 15);
        displayMenu(butter.toString());
    }
    public Object baskinRobinMenu(){
        BaskinRobin iceCream = new BaskinRobin("Banana Royale", 10.50, 15);
        displayMenu(iceCream.toString());
        return null;
    }
    public Object coldStoneMenu(){
        ColdStoneCreamery butter = new ColdStoneCreamery("Peanut Butter Cup", 8.50, 15);
        displayMenu(butter.toString());
        return null;
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
    public Object PizzaHutMenu(){
        PizzaHut veggie = new PizzaHut("spinach alfredo", 15.00, 20);
        displayMenu(veggie.toString());
        return null;
    }
    public String TandooriMenu(){
        TandooriPizza tandoori = new TandooriPizza("Tandoori Chicken", 20.50, 25);
        displayMenu(tandoori.toString());
        return null;
    }


    @Override
    void RestaurantList(String burgers, String fastFood, String pizza, String cafe, String breakfast, String iceCream) {
        System.out.println(burgers+ "\n"+ fastFood +"\n"+ pizza + "\n"+ cafe + "\n"+ breakfast + "\n"+ iceCream);

    }
}
