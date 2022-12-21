package com.bu;

import java.util.Scanner;

public class Hamburger {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    //otan kaloume tis methods autes arxikopoioume ta fields panw gia to onma kai tin timi ka9e extra
    public  void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public  void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public  void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public  void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }



    /* boolean chooselettuce;
    boolean choosetomato;
    boolean choosecarrot;
    boolean chooseonion;


    public Hamburger(String name, String rollType, String meat, double price) {//autes oi times 8a perasoun sto super.dld 8a einai oi metavlites pou 8eloume na parei kai to allo burger
        this.breadRollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    //Asks the customer wether he wants or not one of the extra items for his burger. The customer has to answer with y or n. It returns true when a customer chooses a particular extra and false when not.
    public double chooseExtra(String name, double price){
        boolean isAdding;
        System.out.println("Do you want " + name + "?(Answer with y/n)");

        while (true) {
            String answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("y")){
                isAdding = true;
                break;
            }else if (answer.equals("n")){
                isAdding = false;
                break;
            }else
                System.out.println("Try again. Wrong Iput");
        }

        if (isAdding){
            System.out.println(name + " cost is "+ price +"$");
            return price = price + 0.5;
        }else
            return 0;
        //return isAdding;
    }

    //calculates how much the customer will pay when choosing the extras
    public void extrasPriceCalculator(){

        if(chooseonion || choosetomato || chooselettuce || choosecarrot){
            System.out.println("Extras:");
        }else{
            System.out.println("No extras.");
        }

        if (chooselettuce){
            System.out.println("Lettuce cost is 0,60$");
            price = price + 0.6;
            System.out.println(price);
        }
        if (choosetomato){
            System.out.println("Tomato cost is  0,50$");
            price = price + 0.5;
        }
        if (choosecarrot){
            System.out.println("Carrot cost is  0,30$");
            price = price + 0.3;
        }
        if (chooseonion){
            System.out.println("Onion cost is   0,60$");
            price = price + 0.2;
        }

    }

    //return total price = base price + extras
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    //returns the base price of the burger
    public double getBasePrice() {
        return 10.00;
    }*/
}
