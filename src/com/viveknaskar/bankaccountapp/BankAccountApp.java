package com.viveknaskar.bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        /*
        Checking checkAccount1 = new Checking("Bruce Wayne", "123456789", 1500);
        checkAccount1.showInfo();

        System.out.println("***************");

        Savings savingsAccount1 = new Savings("Clark Kent", "987654321", 2800);
        savingsAccount1.showInfo();
        savingsAccount1.compound();
        */

        /**
         * Read a CSV file and create new accounts base on the data
         */

        List<String[]> newAccountHolders = com.viveknaskar.bankaccountapp.helper.CSVHelper.
                read("E:\\Workspace\\BankAccountApplication\\mock_account_holders.csv");
        for (String[] accountHolder: newAccountHolders) {

            System.out.println("New account holder is:- ");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            System.out.println("Name: " + name
                    + "\nSSN: " + sSN
                    + "\nAccount: " + accountType
                    + "\nInitial Deposit: $" + initDeposit
                    + "\n"
            );



        }

    }

}
