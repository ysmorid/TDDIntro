package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int funds = 0;

    public int addFunds(int deposit) {
        funds += deposit;
        return funds;
    }

    public int withdrawFunds(int withdraw) {
        if(withdraw > funds){
            System.out.println("I'm sorry, you do not have enough to withdraw. Please select " + "$" + funds + " or less.");
        }
        else{
            funds -= withdraw;
        }
        return funds;
    }
}
