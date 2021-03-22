package com.viveknaskar.bankaccountapp;

/**
 * Making the Account class as abstract as we want object
 * to be created from either Checking or Savings class
 */
public abstract class Account implements IBaseRate {

    /**
     * List common properties for Savings/Checking account
     */

    String name;
    String socialSecurityNumber;
    double balance;
    String accountNumber;
    double rate;

    /**
     * Constructor to initialise base properties and initialise the account
     */

    public Account(String name, String socialSecurityNumber, double initDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;
        System.out.println("Name: " + name + "\nSSN: " + socialSecurityNumber + "\nbalance: " + balance);
    }

    /**
     * List Common methods
     */
}
