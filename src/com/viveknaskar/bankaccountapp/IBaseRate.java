package com.viveknaskar.bankaccountapp;

/**
 * Interest Rate will usually set by Government or some third party
 */
public interface IBaseRate {

    /**
     * Method to return a base interest rate
     */
    default double getBaseRate() {
        return 2.5;
    }

}
