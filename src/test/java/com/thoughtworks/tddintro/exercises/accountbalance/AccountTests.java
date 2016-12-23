package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    @Test
    // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account();
        assertThat(account.addFunds(10), is(10));
    }

    @Test
    // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account();
        assertThat(account.withdrawFunds(10), is(0));
    }

    @Test
    // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        Account account = new Account();
        assertThat(account.withdrawFunds(20), is(10));
    }
}
