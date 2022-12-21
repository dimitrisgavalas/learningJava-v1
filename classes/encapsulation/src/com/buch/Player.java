package com.buch;

public class Player {

    //we used public bc we want to be able to initilaize them inside Main
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;

        if(this.health <= 0){
            System.out.println("Player knocked out");
            //reduces number of lives remaining
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
