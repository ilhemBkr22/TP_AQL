package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        Assertions.assertEquals(150, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(-50);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(50);
        Assertions.assertEquals(50, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(-50);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithdrawWithInsufficientBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(150);
    }

    @Test
    public void testTransfer() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(50, account2);
        Assertions.assertEquals(50, account1.getBalance(), 0.01);
        Assertions.assertEquals(250, account2.getBalance(), 0.01);
    }

    @Test(expected = NullPointerException.class)
    public void testTransferWithNullOtherAccount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.transfer(50, null);
    }

    @Test
    public void testAddInterest() {
        BankAccount account = new BankAccount(100, 0.05);
        account.addInterest();
        Assertions.assertEquals(105, account.getBalance(), 0.01);
    }
}
