package com.company;

public class Car {

    /*private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
*/

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private  String colour;

    public  void setModel(String  model){
        String validModel = model.toLowerCase(); // sketo model einai h timi pou dinoume stin method potan tin kaloume
        if(validModel.equals("porsche") || validModel.equals("onoma")){
            this.model = model; // otan 8elw na anferthw sto private model vazw this. to String Model einai h timi pou 8a dws stin methid otan tin kalesw
        }else
            this.model = "Unknown";
    }

    public String getModel(){
        return this.model;
    }

}


























