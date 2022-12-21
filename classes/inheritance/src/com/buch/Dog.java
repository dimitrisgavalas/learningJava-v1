package com.buch;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //otn kanw extend prepei na borw na kanw call ton constructor tis klashs pou knw extend
    public Dog(String name,  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { //initialize base characteristuics of animals. boroume mesw methods na prosthesoume xaraktiristika pou einai suggekrimena gia skilous
        super(name, 1, 1, size, weight); // evgala apo tin panw parenthisi to int brain kai size kai aeval stin katw parenthisi ton arithmo afou toso einai
        //edw pou valame super auto kalei ton constrtyuctor tis parent class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override // reminds that we are overwriting a method tthat is in the superclass/main class
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed); // super = otan 8eloume na kalesoume mia method h genika kati apo tin parent class vazoume tin super prin
    }
}
