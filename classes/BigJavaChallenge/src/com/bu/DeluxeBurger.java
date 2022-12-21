package com.bu;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    /*private double price;
    private boolean chooseChips;
    private boolean chooseDrink;

    public DeluxeBurger() {
        super("Deluxe Burger","deluxe", "double beef", 14);
        //this.price = pr;
    }

    @Override
    public void extrasPriceCalculator() {

        if(chooseChips || chooseDrink){
            System.out.println("Extras:");
        }else{
            System.out.println("No extras.");
        }

        if (chooseChips){
            System.out.println("Chips cost is    0,60$");
            price = price + 2;
        }
        if (chooseDrink) {
            System.out.println("Drink cost is    0,50$");
            price = price + 3;
        }
    }

    @Override
    public double getBasePrice(){
        return 15;
    }*/

}
