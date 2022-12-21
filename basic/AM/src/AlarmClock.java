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

    public void setHour(int ah){

        Scanner inputhour = new Scanner(System.in);
        System.out.println("Set hour of alarm clock: ");
        ah = inputhour.nextInt();


        if(ah>=0 && ah<=24){
            hour = ah;
            System.out.println("Correcto");
        }else
            System.out.println("Fatal error: invalid alarm hour");

    }

    public void setMinute(int am){
        Scanner inputmin = new Scanner(System.in);
        System.out.println("Set hour of alarm clock: ");
        am = inputmin.nextInt();

        if((am >= 0) && (am <= 59))
            minute = am;
        else
            System.out.println("Fatal error: invalid alarm minute");
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }
}
