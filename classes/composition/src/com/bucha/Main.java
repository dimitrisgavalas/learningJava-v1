package com.bucha;

public class Main {

    //px composition. ena pc exei mb,case kai monitor. auta ta 3 den einai enas upologistis. alla o upologistis ta exei.

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5); //ftiaxnouome ena object kai pername tis times width height kai depth

        Case theCase = new Case("220B", "Dell", "240", dimensions); //ftiaxnoume ena object sxetika me xaraktiristika enos case opou kia pername tis parametrous pou 8eloume
        Monitor theMonitor = new Monitor("27 incg", "Acer", 27, new Resolution(2540, 1440)); //ftiaxnoume ena objext sxetika me ena monitor
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44"); //object sxetika me mb.

        PC thePC = new PC(theCase, theMonitor, theMotherboard); //object sxetika me ena pc. opou pername ws metavlites ta object giat ta part enos pc

        thePC.getMonitor().drawPixelAt(1500, 1200,"red"); //apo to object thePC/ dld apo tin klash PC kaloume tin getMonitor method opou auth epistrefei tns klasis Monitor thn method drawPixelAt
        thePC.getMotherboard().loadProgramm(" Windows 1.0"); //omoio me to parapanm. print auto : ("Program" + progName + " is now loading...")
        thePC.getTheCase().pressPowerButton();//omoiws. print System.out.println("Power button pressed");

    }
}
