package com.buch;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eats lots of people";
    }
}

class IndependanceDay extends Movie{
    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids try to escape maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Staw Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class forgetableMovie extends Movie{
    public forgetableMovie() {
        super("forgetable Movie");
    }

    @Override
    public String plot() {
        return "A movie tha you forget";
    }
}

public class Main {

    public static void main(String[] args) {

//        for (int i=1;i<11;i++){
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
//
//        }


        Car car = new Car(8,"Base");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlanser");
        System.out.println(mitsubishi.accelerate());
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new forgetableMovie();
        }

        return null;
    }
}






class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Start Engine";
    }


    public String accelerate(){
        return "Car accelerate";
    }

    public String brake(){
        return "Car brake";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsu startEngine";
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}


public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}



























