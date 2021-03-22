package com.viveknaskar.bankaccountapp;

public class Checking extends Account{

    /**
     * List the properties specific to Checking account
     */
    int debitCardNumber;
    int debitCardPin;

    /**
     * Constructor to initialize Checking account properties
     */
    public Checking(String name, String socialSecurityNumber, double initDeposit) {
        super(name, socialSecurityNumber, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("New Checking Account.");
    }

    /**
     * List any methods specific to the Checking account
     */
}
