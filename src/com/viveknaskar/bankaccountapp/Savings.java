package com.viveknaskar.bankaccountapp;

public class Savings extends Account {

    /**
     * List the properties specific to Savings account
     */
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    /**
     * Constructor to initialize Savings account properties
     */
    public Savings(String name, String socialSecurityNumber, double initDeposit) {
        super(name, socialSecurityNumber, initDeposit);
        System.out.println("New Savings Account.");
    }

    /**
     * List any methods specific to the Savings account
     */
}
