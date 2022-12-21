package com.buch;

public class Main {
//encapsulation is mechanism that allows you to restrict access to certain components in the objects
//protect memebers of class from anauthorized access.Gives more control

   public static void main(String[] args) {

      /* Player player = new Player();

       //mporoume na arxikopoihsoume ta fields tis klashs PLayer epeidi einai arxikopoihmena ws public
       player.name = "Jio";
       player.health = 20;
       player.weapon = "wand";

       int damage = 10;
       player.loseHealth(damage);
       System.out.println("Remaining health = " + player.healthRemaining());

       damage = 11;
       // to provlima edw einai oti egw mporw se auth thn seira na mou pros8esw zwh pou shmainei oti spane oi kanones. mporei na lu8ei px me constructor
       //allo provlima einai an allaxtei to onoma tou field mesa stin klash den 8a treji stin main otan to arxikopoioume etc
       //3o provlima mporoume na to jexasoume
       player.loseHealth(damage);
       System.out.println("Remaining health = " + player.healthRemaining());


       //Edw kanoume encapsulaltion. Vlepoume mesa stin klash EnhancedPLayer pws iparxei enas elegxos sxetika me tis timew
       EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 220, "dildo");
       System.out.println("Initial health is " + enhancedPlayer.getHealth());*/

      //System.out.println(5%2);//upoloipo
//       System.out.println(11/2);

       Printer printer = new Printer(50,true);
       System.out.println(printer.addToner(50));
       System.out.println("initial page count = " + printer.getPagesPrinted());

       int pagesPrinted = printer.printPages(5);
       System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +printer.getPagesPrinted());

//       pagesPrinted = printer.printPages(5);
//       System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +printer.getPagesPrinted());


   }
}
