package ch.juventus.loggin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

    private Bank bank;

    @BeforeEach
    void setup() {
        bank = new Bank(500);
    }

    // withdraw
    @Test
    void shouldWithdrawTen() throws Exception {
        assertEquals(490, this.bank.withdraw(10));
    }

    @Test
    void shouldThrowException() {
        assertThrows(Exception.class, () -> this.bank.withdraw(1000));
    }

    // deposit
    @Test
    void shouldDepositTen() {
        assertEquals(510, this.bank.deposit(10));
    }

    @Test
    void shouldReturnBalance() {
        assertEquals(500, this.bank.retrieveBalance());
    }
}