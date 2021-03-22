package com.viveknaskar.bankaccountapp;

/**
 * Checking Account holders are assigned with Debit card with
 * 12-digit number accessed with 4-digit PIN
 */
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
        setDebitCard();
    }

    /**
     * Checking Account rate will use 15% of the base interest rate
     */
    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    /**
     * List any methods specific to the Checking account
     */

    public void showInfo() {
        System.out.println("Account type: Checking");
        super.showInfo();
        System.out.println(
            " Your Checking Account features: " +
            "\n Debit Card Number: " + debitCardNumber +
            "\n Debit Card PIN: " + debitCardPin
        );
    }

}
