package com.buch;

public class Calculator {

    private Floor floor; // edw krivetai to ypsos kai platos
    private Carpet carpet; //edw to cost

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}
