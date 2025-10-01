package week3.bankingsystem;

public class InvalidFundingAmountException extends BankException {

    public InvalidFundingAmountException(double invalidTransactionAmount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", invalidTransactionAmount));
    }

}
