package com.buch;

public class Vehicle {

    private String name;
    private String size;

    private int curreentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.curreentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steering(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+ currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        curreentVelocity = velocity;
        System.out.println("Vehicle.move() Moving at " + curreentVelocity + " in direction "+ currentDirection);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurreentVelocity(int curreentVelocity) {
        this.curreentVelocity = curreentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop(){
        this.curreentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurreentVelocity() {
        return curreentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
