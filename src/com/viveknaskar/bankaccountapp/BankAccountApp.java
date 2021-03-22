package com.viveknaskar.bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

        Checking checkAccount1 = new Checking("Bruce Wayne", "123456789", 1500);
        checkAccount1.showInfo();

        System.out.println("***************");

        Savings savingsAccount1 = new Savings("Clark Kent", "987654321", 2800);
        savingsAccount1.showInfo();
        /**
         * Read a CSV file and create new accounts base on the data
         */

    }

}
