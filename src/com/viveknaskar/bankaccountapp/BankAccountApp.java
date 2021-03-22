package com.viveknaskar.bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

        Checking checkAccount1 = new Checking("Bruce Wayne", "123456789", 1500);
        checkAccount1.showInfo();

        System.out.println("***************");

        Savings savingsAccount1 = new Savings("Clark Kent", "987654321", 2800);
        savingsAccount1.showInfo();
        savingsAccount1.deposit(10000);
        savingsAccount1.withdraw(1000);
        savingsAccount1.transfer("Home loan",3000);

        /**
         * Read a CSV file and create new accounts base on the data
         */

    }

}
