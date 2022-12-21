package com.co;

public class Main {

    public static void main(String[] args){

        BankAccount ete = new BankAccount("12345",0.00,"Bob Brown","!@1.gr","1234546789");

//        ete.setAccountNumber("12345");
//        ete.setBalance(0.00);
//        ete.setCustomerName("Bob Brown");
//        ete.setEmail("!@1.gr");
//        ete.setPhoneNumber("1234546789");

        System.out.println(ete.getAccountNumber());
        System.out.println(ete.getBalance());

        ete.withdrawFunds(100.00);

        ete.depositFunds(50.00);
        ete.withdrawFunds(100.0);

        ete.depositFunds(50.00);
        ete.withdrawFunds(100.00);
    }
}
