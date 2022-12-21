package vom.buch;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("Ea");
        Wall wall3 = new Wall("So");
        Wall wall4 = new Wall("No");

        Ceiling ceiling = new Ceiling(11,1111);

        Bed bed = new Bed("King",2,3,4,5);

        Lamp lamp = new Lamp("Dildo",true,111);

        Room room = new Room("ssss",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        room.getLamp().turnOn();
        lamp.turnOn();

        bed.make();
        room.makeBed();





    }
}
