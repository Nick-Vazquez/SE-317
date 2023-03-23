package lab4;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.MatcherAssert;

import java.util.*;

import org.junit.*;
import org.junit.rules.*;

public class HandsOnExperience {
    class InsufficientFundsException extends RuntimeException {
        public InsufficientFundsException(String message) {
            super(message);
        }

        private static final long serialVersionUID = 1L;
    }

    class Account {
        int balance;
        String name;

        Account(String name) {
            this.name = name;
        }

        void deposit(int dollars) {
            balance += dollars;
        }

        void withdraw(int dollars) {
            if (balance < dollars) {
                throw new InsufficientFundsException("balance only " + balance);
            }
            balance -= dollars;
        }

        public String getName() {
            return name;
        }

        public int getBalance() {
            return balance;
        }

        public boolean hasPositiveBalance() {
            return balance > 0;
        }
    }

    class Customer {
        List<Account> accounts = new ArrayList<>();

        void add(Account account) {
            accounts.add(account);
        }

        Iterator<Account> getAccounts() {
            return accounts.iterator();
        }
    }

    private Account account;
    // TO DO
    @Before
    public void createAccount() {
        account = new Account("CompanyName");
    }

    // You need to create test cases in Here
    @Test
    public void hasPositiveBalance() {
        account.deposit(50);
        assertTrue(account.hasPositiveBalance());
    }

    @Test
    public void depositIncreasesBalance() {
        int initialBalance = account.getBalance();
        account.deposit(100);
        assertTrue(account.getBalance() > initialBalance);
    }

    @Test
    public void testWithWorthlessAssertionComment() {
        account.deposit(50);
        MatcherAssert.assertThat("account balance is 100",account.getBalance(), equalTo(50));
    }

    @Test
    public void testBadValWithAssertionComment() {
        account.deposit(50);
        MatcherAssert.assertThat("account balance isn't 100",account.getBalance(), equalTo(50));
    }

    @Test
    public void withdrawBeforeDeposit() {
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(100));
        assertEquals(0, account.balance);
    }

    @Test
    public void depositNegativeValue() {
        assertThrows(InsufficientFundsException.class, () -> account.deposit(-50));
    }

    @Test(expected = InsufficientFundsException.class)
    public void throwsWhenWithdrawingTooMuch() {
        System.out.println("I'm a little teapot, short and stout!");
        account.withdraw(100);
    }
}
