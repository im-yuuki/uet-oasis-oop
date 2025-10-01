package week3.bankingsystem;

public class InsufficientFundsException extends BankException {

    public InsufficientFundsException(double invalidTransactionAmount) {
        super(String.format(
                "Số dư tài khoản không đủ $%.2f để thực hiện giao dịch",
                invalidTransactionAmount
        ));
    }

}
