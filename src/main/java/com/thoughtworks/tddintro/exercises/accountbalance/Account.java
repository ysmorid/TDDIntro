package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int funds = 0;

    public void addFunds(int deposit) {
        funds += deposit;
    }

    public void withdrawFunds(int withdraw) {
        if(withdraw > funds){
            System.out.println("I'm sorry, you do not have enough to withdraw. Please select " + "$" + funds + " or less.");
        }
        else{
            funds -= withdraw;
        }
    }

    public int displayFunds(){
        return funds;
    }
}
