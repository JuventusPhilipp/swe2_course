package ch.juventus.loggin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.abs;

public class Bank {

    final Logger logger = LoggerFactory.getLogger(Bank.class);
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double withdraw(double quantity) throws Exception {
        if (getBalance() - quantity < 0) {
            logger.error("balance is to low, you need {} more", abs(getBalance()-quantity));
            throw new Exception("balance is to low");
        }
        return balance -= quantity;
    }

    public double deposit(double quantity) {
        logger.info("{} added to balance", quantity);
        return balance += quantity;
    }

    public double retrieveBalance() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
