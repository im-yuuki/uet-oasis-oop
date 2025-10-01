package week3.bankingsystem;

public class SavingsAccount extends Account {

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double initialBalance = getBalance();
        try {
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, amount, initialBalance, getBalance()));
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void withdraw(double amount) {
        double initialBalance = getBalance();
        try {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (getBalance() - amount < 5000) {
                throw new InsufficientFundsException(amount);
            }
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, amount, initialBalance, getBalance()));
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

}
