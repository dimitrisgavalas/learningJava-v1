package com.buch;

public class Main {

    public static void main(String[] args){



        //BankAccount jimsAccount = new BankAccount();//create new objrct for bankAccount class. BankAccount() actually calling a constructor.
        // Mporoume afou exoume dimiourghsei constructor stin Bankaccount class opou dinoume times stis parametrous na tis valoume kateu8ian otan orizoume to object

        //mporw na adikatastisw tis epomenes 5 grammes me enan constructor pou dimiourgw stin class. kai na pernaw tis times opws vlepw apo panw kateu8ian otn dimiourgw to object
        /*jimsAccount.setAccountNumber("12345");
        jimsAccount.setBalance(300.00);
        jimsAccount.setCustomerName("Jims Gavalas");
        jimsAccount.setEmail("jim@gmail.com");
        jimsAccount.setPhoneNumber("123456789");*/

        /*jimsAccount.withdrawFunds(100.0);

        jimsAccount.depositFunds(50.0);
        jimsAccount.depositFunds(10000.0);

        VipCustomer p1 = new VipCustomer();
        System.out.println(p1.getName());

        VipCustomer p2 = new VipCustomer("CCC", 25000.0);
        System.out.println(p2.getName());

        VipCustomer p3 = new VipCustomer("ttt", 100.0,"@wwww.com");
        System.out.println(p3.getName());*/

        //Point onoma = new Point(10,20);
        //Point onoma2 = new Point(3,4);


        //System.out.println(onoma.distance(onoma));

        //System.out.println(onoma.distance());


        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);

        one.add(1,1); // pross8etoume ston one real kai coomplex ton arithmo stin paren8esi
        //number.add(2.5,-1.5);

        System.out.println("one.real= " +one.getReal()); // emfanizetai to athrismna apo one kai add
        System.out.println("one.imaginery= "+ one.getImaginary());

        one.subtract(number); //afairoume apo to 1.0 to 2.5=-1.5 kai apo to 1 to -1.5=2.5
        System.out.println("one.real= " +one.getReal());
        System.out.println("one.imaginery= "+ one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " +number.getReal());
        System.out.println("number.imaginery= "+ number.getImaginary());



        //System.out.println(ena.add(2,6));


    }


}






















//test 1
/*
public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public void setFirstNumber(double firstName){
        this.firstNumber = firstName;
    }
    public void setSecondNumber(double secondName){

        this.secondNumber = secondName;
    }
    public double getFirstNumber(){
        return this.firstNumber;

    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionalResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getDivisionResult(){
        if (this.secondNumber!=0){
            return this.firstNumber / this.secondNumber;
        }else
            return 0;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }


}
*/
