import java.util.Scanner;

public class AlarmClock {

    Scanner scan = new Scanner(System.in);

    public String description;
    public String sound;
    private int hour;
    private int minute;
    private boolean vibration;
    private int ringinDuration;
    private int snoozeDuration;


    public void DescriptionSound(){
        Scanner scd = new Scanner(System.in);
        System.out.println("Add a Description for your alarm:\n");
        description = scd.nextLine();
        System.out.println("Your Descripion is "+ description);

        Scanner sc = new Scanner(System.in);



        int a ;
        int num = 0;

        do {
            if(num == 0){
                System.out.println("\nChoose sound for alarm:(With 1-5)\n");
                System.out.println("1.Aegean Sea\n2.Ionian Sea\n3.Lions Roar\n4.Bird Singing\n5.Hakuna Matata\n\n");
            }else
                System.out.println("That's not correct. Please try again.");

           // sc.next(); // this is important!

            a = sc.nextInt();
            num = num +1;
        } while (a <= 0 || a > 6);



        if(a == 1){
            System.out.println("Aegean Sea Picked\n");
            sound = "Aegean Sea";
        }else if(a ==2){
            System.out.println("Ionian Sea Picked\n");
            sound = "Ionian Sea";
        }else if(a == 3){
            System.out.println("Liona Roar Picked\n");
            sound = "Lions Roar";
        }else if(a == 4){
            System.out.println("Bird Singing Picked\n");
            sound = "Bird Singing";
        }else if (a == 5){
            System.out.println("Hakuna Matata Picked\n");
            sound = "Hakuna Matata";
        }
    }

    public void setHour(){

        Scanner inputhour = new Scanner(System.in);
        System.out.println("Set hour of alarm clock: ");
        int ah = inputhour.nextInt();


        while (ah < 0 || ah > 23) {

            System.out.println("Fatal error: invalid alarm hour");
            System.out.println("Set hour of alarm clock: ");
            ah = inputhour.nextInt();

        }
        System.out.println("Correcto");
        this.hour = ah;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(){
        Scanner inputmin = new Scanner(System.in);
        System.out.println("Set minutes of alarm clock: ");
        int am = inputmin.nextInt();

        while (am < 0 || am > 59) {

            System.out.println("Fatal error: invalid alarm hour");
            System.out.println("Set minutes of alarm clock: ");
            am = inputmin.nextInt();

        }
        System.out.println("Correcto");
        minute = am;
    }

    public int getMinute(){
        return minute;
    }

    public void setVibration(){

         //edw apo8ikeuetai to input
        //emeis 9eloume na elejoume an einai Y h N
        // episis 9eloume h apadisei na apo9ikeutei sto vibration pou einai boolean ara an apadisei== Y tote vibration = true

        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to activate the Vibration?(answer with Y/N):\n");
        while (!sc.hasNext("[yYnN]")) {
            System.out.println("That's not correct!");
            System.out.print("Would you like to activate the Vibration?(answer with Y/N):\n");
            sc.next();
        }
        String vowel = sc.next();

        if(vowel.equals("Y") || vowel.equals("y")){
            vibration = true;
            System.out.println("Done. The vibration is set ON");
        }else{
            vibration = false;
            System.out.println("Done. The vibration is set OFF");
        }

    }

    public boolean getVibration(){
        return vibration;
    }

    public void setRinginDuration(){

        Scanner inputhour = new Scanner(System.in);
        System.out.println("Add Ringing Duration: ");
        int ah = inputhour.nextInt();


        while (ah < 0 || ah > 59) {

            System.out.println("Fatal error: invalid alarm hour");
            System.out.println("Set hour of alarm clock: ");
            ah = inputhour.nextInt();

        }
        System.out.println("Your ringing duration is " + ah + " minutes");
        ringinDuration = ah;

    }

    public int getRinginDuration(){
        return ringinDuration;
    }

    public void setSnoozeDuration(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nDo you want to snooze or stop the alarm? (Answer with stop or snooze)");
        while (!sc.hasNext("snooze") && !sc.hasNext("Snooze") && !sc.hasNext("Stop") && !sc.hasNext("stop")) {
            System.out.println("That's not correct! Try again");
            System.out.println("Do you want to snooze or stop the alarm? (Answer with stop or snooze)");
            sc.next();
        }
        String vowel = sc.next();
        System.out.println("Your answer is " + vowel);

        if(vowel.equals("stop") || vowel.equals("Stop")){
            System.out.println("Your alarm is turned off");
        }else{
            snoozeDuration = 5;
            minute = minute +5;
            System.out.println("Your alarm will buzz in 5 minutes @ " +hour +":" +minute);
        }
    }

    public int getSnoozeDuration(){
        return snoozeDuration;
    }


   public void printAlarmClockOrder(){



    }



}
