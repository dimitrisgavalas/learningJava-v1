package com.buch;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Dname", 1000.0, "default@mail.com");
        System.out.println("This is an empty constructor");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "kostas@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
