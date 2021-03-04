package ch.juventus.loggin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setup() {
        bank = new Bank(500);
    }

    @Test
    public void shouldWithdrawTen() throws Exception {
        assertEquals(490, bank.withdraw(10));
    }

    @Test
    public void shouldThrowException() {
        assertThrows(Exception.class, () -> this.bank.withdraw(1000));
    }

    // deposit
    @Test
    public void shouldDepositTen() {
        assertEquals(510, this.bank.deposit(10));
    }

    @Test
    public void shouldReturnBalance() {
        assertEquals(500, this.bank.retrieveBalance());
    }
}
