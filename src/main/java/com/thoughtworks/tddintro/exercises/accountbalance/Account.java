package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int addFunds(int deposit) {
        int funds = 0;

        funds += deposit;
        return funds;
    }

    public int withdrawFunds(int withdraw) {
        int funds = 10;

        funds-= withdraw;
        return funds;
    }
}
