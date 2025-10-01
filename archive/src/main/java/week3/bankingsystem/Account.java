package week3.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private long accountNumber;
    private double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    public Account() {
        this.accountNumber = 0;
        this.balance = 0;
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    protected void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;
    }

    protected void doWithdrawing(double amount) throws InsufficientFundsException, InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (balance < amount) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder();
        history.append("Lịch sử giao dịch của tài khoản ").append(accountNumber).append(":\n");
        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append("\n");
        }
        return history.toString();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Account account = (Account) other;
        return accountNumber == account.accountNumber;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
