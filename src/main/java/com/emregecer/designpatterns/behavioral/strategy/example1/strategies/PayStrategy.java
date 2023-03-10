package com.emregecer.designpatterns.behavioral.strategy.example1.strategies;

/**
 * Common interface for all strategies.
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
    
}
