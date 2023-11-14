package com.solvd.foodDelivery.delivery;

import com.solvd.foodDelivery.LogInfo.CustomLogger;
import com.solvd.foodDelivery.Restaurants.nameAddress;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DeliveryDetails extends DriverDetails implements Payment, nameAddress {
    private CustomLogger Logger;
    public DeliveryDetails() {
        // Create an instance of CustomLogger for this class
        this.Logger = new CustomLogger(DeliveryDetails.class.getName());
    }

    Scanner scan = new Scanner (System.in);//
    @Override // nameAddress interface
    public void displayName(String name, String address) {
    }

    @Override // payment interface
    public void cardDetail(String number, String date) {
    }

    @Override // driver details class
    void driverName(String name, String carNumber) {
        System.out.println("Driver name:" + name+"\n"+"car number:"+ carNumber);
    }
    public void driver(){
        driverName("Jacob Johnson", "Ab12CD34");
    }
    public void waitTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy hh:mm:ss");
        cal.add(Calendar.MINUTE, 10);
        System.out.println(sdf.format(cal.getTime()));

    }
    public void OrderDetails(){
        Logger.Info("please enter your age ");
        int age = scan.nextInt();
        if(age >=18){
            System.out.println("Eligible for ordering food ");
        }
        else{
            throw new IllegalArgumentException("********IllegalArgumentException********" +"\n" +"Not Eligible for Voting");
        }
        System.out.println();
        Logger.Info("please add your  name ");
        String name = scan.nextLine();
        Logger.Info("please add your  delivery address ");
        String address = scan.nextLine();
        displayName( name, address);
        try {
            char c = name.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("*******StringIndexOutOfBoundsException*******");
        }
        Logger.Info("please enter your card number");
        String number = scan.nextLine();
        try {
            int a = Integer.parseInt(number);
            int b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("**********ArithmeticException*********" + "\n"+ "Can't divide a number by 0");
        }
        Logger.Info("please enter expiry date");
        String date = scan.nextLine();
        cardDetail( number, date);
        System.out.println();
        Logger.Info(name+ ","+ address);
        driver();
        Logger.Info("delivery time 10 minutes ");
        waitTime();
    }





}
