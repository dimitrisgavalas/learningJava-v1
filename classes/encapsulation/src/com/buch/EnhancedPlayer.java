package com.buch;

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;

        if (health > 0 && health <= 200){
            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;

        if(this.health <= 0){
            System.out.println("Player knocked out");
            //reduces number of lives remaining
        }
    }
}
