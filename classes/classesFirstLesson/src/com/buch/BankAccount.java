package com.buch;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //dimiourgia constructor etsi wste na perasoume tis pede times stis parametrous apo panw. Pio grhgoro
    public BankAccount(){ //puropuse of constructpor. Initialize the object you are creating. Etsi kaneis oti einai pou 8eleis na kaneis tin stigmi pou dimiourgeitai to object.
        // Kaleitai mono mia fora stin arxh tis main otan dimiourgeitai to object.PS gia na kalestei autos o constructor kai oxi o katw prepei to object stin main na einai keno
        this("12344",0.00,"jijim","aaaa","@kati.gr"); //calling constructor in another constructor. Gia na ginei auto prepei na bainei ws 1h edoli mesa ston constructor.
        // Auti h edoli kalei ton constructor apo katw
        System.out.println("Empty constructor called");
    }

    public BankAccount(String phoneNumber,double balance, String accountNumber, String customerName,String email){
        System.out.println("Account cons with parameters called");
        this.accountNumber = accountNumber;
        //setAccountNumber(accountNumber); to idio me to panw

        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depAmount){
        this.balance = this.balance + depAmount;
        System.out.println("Funds deposited = " + depAmount + " .Total money = " + this.balance);
    }

    public void withdrawFunds(double withAmount){
        if(this.balance < withAmount){
            System.out.println("Only " + this.balance + " available. Not enough money.");
        }else{
            this.balance = this.balance - withAmount;
            System.out.println("Funds withdrawn = " + withAmount + " .Total money = " + this.balance);
        }
    }

}
/*public void setdepositFunds(double balance){
        this.balance = this.balance + balance;
    }

    public double getdepositFunds(){
        return this.balance;
    }

    public void setwithdrawFunds(double balance){
        if(this.balance < balance){
            System.out.println("");
        }else{
            this.balance = this.balance - balance;
        }
    }

    public double getwithdrawFunds(){
        return this.balance;
    }

    public double depositFunds(double balance){
        return this.balance = this.balance + balance;
    }

    public double withdrawFunds(double balance){
        if(this.balance < balance){
            System.out.println("");
        }else{
            return this.balance = this.balance - balance;
        }
    }*/