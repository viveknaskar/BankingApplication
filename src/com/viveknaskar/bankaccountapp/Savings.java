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
        accountNumber = "1" + accountNumber;
    }

    /**
     * List any methods specific to the Savings account
     */
    public void showInfo() {
        super.showInfo();
        System.out.println("Account type: Savings");
    }
}
