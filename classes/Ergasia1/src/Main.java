import java.util.Scanner;

public class Main {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            AlarmClock alarmObject = new AlarmClock();
            AlarmClock alarmObject1 = new AlarmClock();

            alarmObject.DescriptionSound();
            alarmObject.setHour();
            alarmObject.getHour();
            alarmObject.setMinute();
            alarmObject.getMinute();
            alarmObject.setVibration();
            alarmObject.setRinginDuration();
            alarmObject.setSnoozeDuration();


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

