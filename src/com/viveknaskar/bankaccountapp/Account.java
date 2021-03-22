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

    static int index = 10000;

    /**
     * Constructor to initialise base properties and initialise the account
     */

    public Account(String name, String socialSecurityNumber, double initDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;
        System.out.println("Name: " + name + "\nSSN: " + socialSecurityNumber + "\nbalance: " + balance);

        /**
         * Set account number
         */
        index++;
        this.accountNumber = setAccountNumber();
    }

    /**
     * 11-digit Account Number should have the below requirements:
     * 1 for Savings and 2 for Checking (is being set by Savings/Checking class)
     * last two digits of SSN
     * unique 5-digit number
     * random 3-digit number
     * @return Account Number
     */
    private String setAccountNumber() {
        String lastTwoOfSSN = socialSecurityNumber
                .substring(socialSecurityNumber.length()-2, socialSecurityNumber.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueId + randomNumber;
    }

    /**
     * List Common methods
     */
}
