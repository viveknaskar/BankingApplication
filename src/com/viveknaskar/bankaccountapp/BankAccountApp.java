package com.viveknaskar.bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();

        /**
         * Read a CSV file and create new accounts base on the data
         */

        List<String[]> newAccountHolders = com.viveknaskar.bankaccountapp.helper.CSVHelper.
                read("E:\\Workspace\\BankAccountApplication\\mock_account_holders.csv");
        for (String[] accountHolder: newAccountHolders) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if(accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Cannot read the account type.");
            }

            /**
             * Iterating over the list of accounts and showing info
             */
            for (Account account: accounts) {
                System.out.println("\n");
                account.showInfo();
            }

        }

    }

}
