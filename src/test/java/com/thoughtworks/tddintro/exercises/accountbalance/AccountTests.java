package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account();
        assertThat(account.addFunds(10), is(10));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account();
        assertThat(account.withdrawFunds(10), is(0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        Account account = new Account();
        assertThat(account.withdrawFunds(20), is(10));
    }
}
