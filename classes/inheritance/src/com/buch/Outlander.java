package com.buch;

public class Outlander extends Car{

    private int roadService;

    public Outlander(int roadService) {
        super("Outlnader", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){

        int newVelocity = getCurreentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else
            changeGear(4);

        if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
