package com.buch;

public class Car{
    //public = unresricted access to class

    //1.state of thr car. We difine 5 firlds
    //2.creatae an object at main
    //3. those below are fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //create a methid that will be attached to the objects you create for the particular class
    public void setModel(String model){
        //problem exoume 2 eidwn metavlitwn. 1. to private String model pou einai field kai to String model pou einai parametros pou penraei stin klash
        // vazw this. otan anaferomai sta fields ths klashs. dld ta merh pou exoume panw kai 8elw na kanw access se auto
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model; // diladi twra sto filed model vazw in parametrw model pou pernaw sto method ths klashs Car
        }else{
            this.model = "Uknown";
        }
    }

    public String getModel(){
        return  this.model;
    }
}
