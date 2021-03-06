package com.viveknaskar.bankaccountapp;

/**
 * Making the Account class as abstract as we want object
 * to be created from either Checking or Savings class
 */
public abstract class Account implements IBaseRate {

    /**
     * List common properties for Savings/Checking account
     */

    private String name;
    private String socialSecurityNumber;
    private double balance;

    /**
     * These will be available in both Savings and Checking accounts due
     * to protected access modifier
     */
    protected String accountNumber;
    protected double rate;

    private static int index = 10000;

    /**
     * Constructor to initialise base properties and initialise the account
     */

    public Account(String name, String socialSecurityNumber, double initDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;

        /**
         * Set account number
         */
        index++;
        this.accountNumber = setAccountNumber();

        /**
         * Calling the setRate method which will call the implemented method
         * from Checking or Savings class
         */
        setRate();
    }

    /**
     * Making this method as abstract so that Savings/Checking Classes will
     * override this and provide an implementation
     */
    public abstract void setRate();

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
                .substring(socialSecurityNumber.length()-2);
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueId + randomNumber;
    }

    /**
     * Method for calculating compound interest
     */
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    /**
     * List of Common methods - transactions
     */

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String transLocation, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + transLocation);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    /**
     * This method reveals relevant account information
     */
    public void showInfo() {
        System.out.println(
                "Name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nInterest rate: " + rate + "%"
        );
    }
}
