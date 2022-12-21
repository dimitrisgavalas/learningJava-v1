package com.bu;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }

    /*private double price;
    boolean chooseAvocado;
    boolean chooseMushrooms;

    public HealthyBurger(String meat,double price) {
        super("Healthy Burger","brown smth", meat, price);
        this.price = price;
    }


    public void extrasPriceCalculator() {
        double price = this.price;
        if(chooseonion || choosetomato || chooselettuce || choosecarrot || chooseAvocado || chooseMushrooms){
            System.out.println("Extras:");
        }else{
            System.out.println("No extras.");
        }

        if (chooselettuce){
            System.out.println("Lettuce cost is    0,60$");
            price = price + 0.6;
            System.out.println(price);
        }
        if (choosetomato){
            System.out.println("Tomato cost is     0,50$");
            price = price + 0.5;
        }
        if (choosecarrot){
            System.out.println("Carrot cost is     0,30$");
            price = price + 0.3;
        }
        if (chooseonion){
            System.out.println("Onion cost is      0,60$");
            price = price + 0.2;
        }
        if (chooseMushrooms){
            System.out.println("Mushrooms cost is  0,60$");
            price = price + 0.6;
        }
        if (chooseAvocado){
            System.out.println("Avocado cost is    0,60$");
            price = price + 1;
        }
    }

    @Override
    public double getBasePrice() {
        return 15;
    }
*/
}
