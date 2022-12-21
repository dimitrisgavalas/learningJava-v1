import java.util.Scanner;

public class Main {
}

public class AlarmClock {
    public static void main(String[] args){}

    public String description;
    public String sound;
    private int hour;
    private int minute;
    private boolean vibration;
    private int ringinDuration;
    private int snoozeDuration;

    public void setHour(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Set Hour you want to wake up: ");
        String setHour = scan.next();
    }






}

/*public  int getHour(){}
    public  void setMinute(){}
    public int getMinute(){}
    public void setVibration(){}
    public String getVibration(){}
    public void setRingingDuration(){}
    public String getRingingDuration(){}
    public void setSnoozeDuration(){}
    public int getSnoozeDuration(){}
*/