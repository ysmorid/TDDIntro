package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int addFunds(int deposit) {
        int funds = 0;

        funds += deposit;
        return funds;
    }

    public int withdrawFunds(int withdraw) {
        int funds = 10;
        if(withdraw > funds){
            System.out.println("I'm sorry, you do not have enough to withdraw. Please select " + "$" + funds + " or less.");
        }
        else{
            funds-= withdraw;
        }
        return funds;
    }
}
