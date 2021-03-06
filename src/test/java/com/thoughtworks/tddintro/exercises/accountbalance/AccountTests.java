package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account();
        account.addFunds(10);
        assertThat(account.displayFunds(), is (10));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account();
        account.addFunds(10);
        account.withdrawFunds(10);
        assertThat(account.displayFunds(), is (0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        Account account = new Account();
        account.addFunds(10);
        account.withdrawFunds(20);
        assertThat(account.displayFunds(), is (10));
    }
}
