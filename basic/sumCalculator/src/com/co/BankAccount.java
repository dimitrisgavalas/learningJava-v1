package com.co;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty cpnstructor called");
    }
    public BankAccount(String accountNumber,double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit od " + depositAmount + " made. New balance is " +this.balance);
    }

    public void withdrawFunds(double withdrawAmount){
        if(balance - withdrawAmount < 0){
            System.out.println("Only " +balance+" available. Withdrawal not processed.");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of"+ withdrawAmount+" processed. Remainin balance " +this.balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
