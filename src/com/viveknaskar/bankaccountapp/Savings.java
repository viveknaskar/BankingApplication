package com.viveknaskar.bankaccountapp;

/**
 * Savings Account holders are given safety deposit box identified by 3-digit number
 * accessed with 4-digit PIN
 */
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
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    /**
     * List any methods specific to the Savings account
     */
    public void showInfo() {
        System.out.println("Account type: Savings");
        super.showInfo();
        System.out.println(
                " Your Savings Account features: " +
                "\n Safety Deposit Box Id: " + safetyDepositBoxId +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
