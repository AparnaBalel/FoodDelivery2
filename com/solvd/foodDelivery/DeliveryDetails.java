package com.solvd.foodDelivery;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DeliveryDetails extends DriverDetails implements Payment, nameAddress{

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
        System.out.println("please add your  name ");
        String name = scan.nextLine();
        System.out.println("please add your  delivery address ");
        String address = scan.nextLine();
        displayName( name, address);
        System.out.println("please enter your card number");
        String number = scan.nextLine();
        System.out.println("please enter expiry date");
        String date = scan.nextLine();
        cardDetail( number, date);
        System.out.println();
        System.out.println(name+ ","+ address);
        driver();
        System.out.println("delivery time 10 minutes ");
        waitTime();
    }





}
