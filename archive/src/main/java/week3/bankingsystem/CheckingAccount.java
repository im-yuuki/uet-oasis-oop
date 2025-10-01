package week3.bankingsystem;

public class CheckingAccount extends Account {

    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double initialBalance = getBalance();
        try {
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, amount, initialBalance, getBalance()));
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void withdraw(double amount) {
        double initialBalance = getBalance();
        try {
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, amount, initialBalance, getBalance()));
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

}
